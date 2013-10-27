package musicRepresentation;

import grammar.ABCMusicLexer;
import grammar.ABCMusicListener;
import grammar.ABCMusicParser;
import grammar.ABCMusicParser.Abc_headerContext;
import grammar.ABCMusicParser.Abc_lineContext;
import grammar.ABCMusicParser.Abc_musicContext;
import grammar.ABCMusicParser.Abc_tuneContext;
import grammar.ABCMusicParser.AccidentalContext;
import grammar.ABCMusicParser.BasenoteContext;
import grammar.ABCMusicParser.CommentContext;
import grammar.ABCMusicParser.ElementContext;
import grammar.ABCMusicParser.End_of_lineContext;
import grammar.ABCMusicParser.Field_composerContext;
import grammar.ABCMusicParser.Field_default_lengthContext;
import grammar.ABCMusicParser.Field_keyContext;
import grammar.ABCMusicParser.Field_meterContext;
import grammar.ABCMusicParser.Field_numberContext;
import grammar.ABCMusicParser.Field_tempoContext;
import grammar.ABCMusicParser.Field_titleContext;
import grammar.ABCMusicParser.Field_voiceContext;
import grammar.ABCMusicParser.KeyContext;
import grammar.ABCMusicParser.Key_accidentalContext;
import grammar.ABCMusicParser.KeynoteContext;
import grammar.ABCMusicParser.LineContext;
import grammar.ABCMusicParser.LyricContext;
import grammar.ABCMusicParser.Lyric_textContext;
import grammar.ABCMusicParser.Lyrical_elementContext;
import grammar.ABCMusicParser.MeterContext;
import grammar.ABCMusicParser.Mid_tune_fieldContext;
import grammar.ABCMusicParser.Mode_minorContext;
import grammar.ABCMusicParser.Multi_noteContext;
import grammar.ABCMusicParser.NoteContext;
import grammar.ABCMusicParser.Note_elementContext;
import grammar.ABCMusicParser.Note_lengthContext;
import grammar.ABCMusicParser.Note_length_strictContext;
import grammar.ABCMusicParser.Note_or_restContext;
import grammar.ABCMusicParser.OctaveContext;
import grammar.ABCMusicParser.Other_fieldsContext;
import grammar.ABCMusicParser.PitchContext;
import grammar.ABCMusicParser.RestContext;
import grammar.ABCMusicParser.TempoContext;
import grammar.ABCMusicParser.Tuplet_elementContext;
import grammar.ABCMusicParser.Valid_letterContext;
import grammar.ABCMusicParser.Valid_noteContext;
import grammar.ABCMusicParser.Valid_text_with_numberContext;

import java.util.Map;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import sound.Pitch;

public class ABCMusicParseListener implements ABCMusicListener {

    private static Stack<Object> stack = new Stack<Object>();

    public ABCHeader getHeader() {
        return (ABCHeader) stack.pop();
    }

    public Map<String, Voice> getVoiceMap() {
        return (Map<String, Voice>) stack.pop();
    }

    @Override
    public void enterEveryRule(ParserRuleContext arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitEveryRule(ParserRuleContext arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visitErrorNode(ErrorNode arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void visitTerminal(TerminalNode arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterValid_text_with_number(Valid_text_with_numberContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitValid_text_with_number(Valid_text_with_numberContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterNote_length_strict(Note_length_strictContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitNote_length_strict(Note_length_strictContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterAbc_music(Abc_musicContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitAbc_music(Abc_musicContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterOther_fields(Other_fieldsContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitOther_fields(Other_fieldsContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterAbc_header(Abc_headerContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitAbc_header(Abc_headerContext ctx) {
        int x;
        String title = "";
        
        // When the field 'C' is omitted, any reasonable string will suffice (e.g. "Unknown").
        String composer = "Unknown";
        
        int beatsPerMinute = -1; // Check later if modified
         // When the field 'M' is omitted, the default value for meter is 4/4.
        int beatsPerMeasure = 4; // Denominator of Meter
        double whatNoteGetsTheBeat = 1/4; // Divisor of Meter
        double defaultNoteLength = -1; // Check later if modified
        double bpmNoteLength = -1; // Check later if modified
        String key = "";

        while (!stack.isEmpty()) {
            // FIELD_TITLE
            String field = stack.pop().toString();
            
            // X:
            if (field.equals("X:")) {
                x = Integer.valueOf(stack.pop().toString());
                
            // Title
            } else if (field.equals("T:")) {
                title = stack.pop().toString();
                
            // Composer
            } else if (field.equals("C:")) {
                composer = stack.pop().toString();

            // Default Length
            } else if (field.equals("L:")) {
                String[] parsed = stack.pop().toString().split("/");
                double denominator = Double.valueOf(parsed[0]);
                double divisor = Double.valueOf(parsed[1]);
                defaultNoteLength = denominator / divisor;

            // Meter
            } else if (field.equals("M:")) {
                String[] parsed = stack.pop().toString().split("/");
                int denominator = Integer.valueOf(parsed[0]);
                int divisor = Integer.valueOf(parsed[1]);
                whatNoteGetsTheBeat = 1.0 / divisor;
                beatsPerMeasure = denominator;

            // Tempo (BPM)
            } else if (field.equals("Q:")) {
                String tempo = (String)stack.pop();
                
                String[] parsed = tempo.split("=");
                
                beatsPerMinute = Integer.valueOf(parsed[1]);

                String[] note = parsed[0].split("/");
                double denominator = Double.valueOf(note[0]);
                double divisor = Double.valueOf(note[1]);

                bpmNoteLength = denominator / divisor;
                
            // Key
            } else if (field.equals("K:")) {
                key = stack.pop().toString();
            }
        }
        
        /* If there is no 'L' field defined, a unit note length is set based on
         * the meter: if it is less than 0.75 the default unit note length is a
         * sixteenth note; if it is 0.75 or greater, it is an eighth note. For
         * example, 2/4 = 0.5, so, the default unit note length is a sixteenth
         * note, while for 4/4 = 1.0, or 6/8 = 0.75, or 3/4= 0.75, it is an
         * eighth note. Notice that if neither 'M' nor 'L' fields are present,
         * the default note length is an eighth.
         */ 
        if(defaultNoteLength < 0){
            double meter = beatsPerMeasure*whatNoteGetsTheBeat;
            if(meter < 0.75) {
                defaultNoteLength = 1/16;
            } else {
                defaultNoteLength = 1/8;
            }
        }
        
        /* When the field 'Q' is omitted, the default value is 100
         * default-length notes (given by field 'L') per minute. Notice,
         * however, that when 'Q' is specified, it includes a beat size, and the
         * tempo is not based on 'L'. */
        if(beatsPerMinute < 0 && bpmNoteLength < 0) {
            beatsPerMinute = 100;
            bpmNoteLength = defaultNoteLength;
        }
        
        int leastCommonTick = 1536; // 3*2^9 (Covers really short beats and also triplets)
        int ticksPerBeat = (int)(leastCommonTick*defaultNoteLength);
        
        ABCHeader header = new ABCHeader(title,composer,beatsPerMinute, bpmNoteLength,
                                    ticksPerBeat, whatNoteGetsTheBeat,defaultNoteLength,key);
        
        // Push header to the stack
        stack.push(header);
    }

    @Override
    public void enterMulti_note(Multi_noteContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitMulti_note(Multi_noteContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterTempo(TempoContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitTempo(TempoContext ctx) {

    }

    @Override
    public void enterLine(LineContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitLine(LineContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterNote_element(Note_elementContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitNote_element(Note_elementContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterBasenote(BasenoteContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitBasenote(BasenoteContext ctx) {
        // basenote : valid_note;
        // WE DON'T NEED TO DO ANYTHING HERE!!!!!!!
    }

    @Override
    public void enterNote_length(Note_lengthContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitNote_length(Note_lengthContext ctx) {
        // note_length : NUMBER? SLASH NUMBER? | NUMBER;
        double num = 1.;
        double den = 1.;

        if (ctx.getChildCount() == 1) {
            // we can have a number or a bar
            switch (ctx.start.getType()) {
            case ABCMusicLexer.NUMBER:
                num = Double.parseDouble(ctx.getChild(0).getText());
                ;
                break;
            case ABCMusicLexer.SLASH:
                den = 2.;
                break;
            }
        } else if (ctx.getChildCount() == 3) {
            // we must have a number, a bar, and a number
            num = Double.parseDouble(ctx.getChild(0).getText());
            den = Double.parseDouble(ctx.getChild(2).getText());
        } else {
            // we can only have slash-number or number-slash here
            if (ctx.getChild(0).getText().equals("/")) {
                den = Double.parseDouble(ctx.getChild(1).getText());
            } else {
                num = Double.parseDouble(ctx.getChild(0).getText());
            }
        }
        stack.push(num / den);
    }

    @Override
    public void enterValid_note(Valid_noteContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitValid_note(Valid_noteContext ctx) {
        // valid_note : A_THROUGH_G | LOWERCASE_B | CAPITAL_C;
        stack.push(new Character(ctx.start.getText().charAt(0)));

    }

    @Override
    public void enterAbc_tune(Abc_tuneContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitAbc_tune(Abc_tuneContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterField_key(Field_keyContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitField_key(Field_keyContext ctx) {
        // field_key : FIELD_K SPACE* key end_of_line;
        stack.push(ctx.key().getText());
        stack.push(ctx.FIELD_K().getText());
    }

    @Override
    public void enterMeter(MeterContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitMeter(MeterContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterAccidental(AccidentalContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitAccidental(AccidentalContext ctx) {
        // Notice that if we find an accidentalValue EQUALS, in order to
        // indicate to the exitpitch
        // method that this is being neutrally accented, we pass an accidental
        // value of 8!!!!!!

        // accidental : CARET | CARET CARET | UNDERSCORE | UNDERSCORE UNDERSCORE
        // | EQUALS ;
        int accidentalValue = 0;

        // Creating a new int according to the node we are visiting.
        if (ctx.getChildCount() == 1) {
            switch (ctx.start.getType()) {
            case ABCMusicLexer.CARET:
                accidentalValue = 1;
                break;
            case ABCMusicLexer.UNDERSCORE:
                accidentalValue = -1;
                break;
            case ABCMusicLexer.EQUALS:
                accidentalValue = 8;
                break;
            }
        } else if (ctx.CARET() != null) {
            accidentalValue = 2;
        } else if (ctx.UNDERSCORE() != null) {
            accidentalValue = -2;
        }
        stack.push(accidentalValue);
    }

    @Override
    public void enterTuplet_element(Tuplet_elementContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitTuplet_element(Tuplet_elementContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterKey(KeyContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitKey(KeyContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterNote(NoteContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitNote(NoteContext ctx) {
        // Case 1: A note has two children which means that it has a note_length
        // child. In this
        // case, we will pop the double (that represents the note
        // length) and an Object, that represents a Pitch or a period of rest.
        // If the object is a
        // Pitch, we instantiate a Note, and push it to the stack,
        // and if it is a period of rest, we instantiate a Rest object and push
        // it to the stack.
        // Case 2 (Rest): A note has one child which means that it does not have
        // a note_length
        // child. We follow procedure as above, instantiating a Note or
        // Rest object using the default value of one for durationMultiplier.
        switch (ctx.getChildCount()) {
        case 2:
            double noteLength = (double) stack.pop();
            if (stack.peek() instanceof Pitch) {
                Note n = new Note((Pitch) stack.pop(), noteLength);
                stack.add(n);
                return;
            } else if (stack.peek() instanceof Character) {
                stack.pop();
                Rest r = new Rest(noteLength);
                stack.add(r);
                return;
            }
            break;
        case 1:
            if (stack.peek() instanceof Pitch) {
                Note n = new Note((Pitch) stack.pop());
                stack.add(n);
                return;
            } else if (stack.peek() instanceof Character) {
                Rest r = new Rest();
                stack.add(r);
                return;
            }
            break;
        }
    }

    @Override
    public void enterValid_letter(Valid_letterContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitValid_letter(Valid_letterContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterKeynote(KeynoteContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitKeynote(KeynoteContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterField_tempo(Field_tempoContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitField_tempo(Field_tempoContext ctx) {
        /*
         * When the field 'Q' is omitted, the default value is 100
         * default-length notes (given by field 'L') per minute. Notice,
         * however, that when 'Q' is specified, it includes a beat size, and the
         * tempo is not based on 'L'.
         * 
         * field_tempo : FIELD_Q SPACE* tempo end_of_line;
         */
        // field_tempo : FIELD_Q SPACE* tempo end_of_line;
        stack.push(ctx.tempo().getText());
        stack.push(ctx.FIELD_Q().getText());
    }

    @Override
    public void enterElement(ElementContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitElement(ElementContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterLyrical_element(Lyrical_elementContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitLyrical_element(Lyrical_elementContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterMid_tune_field(Mid_tune_fieldContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitMid_tune_field(Mid_tune_fieldContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterEnd_of_line(End_of_lineContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitEnd_of_line(End_of_lineContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterLyric_text(Lyric_textContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitLyric_text(Lyric_textContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterAbc_line(Abc_lineContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitAbc_line(Abc_lineContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterField_composer(Field_composerContext ctx) {
        // TODO Auto-generated method stub
    }

    @Override
    public void exitField_composer(Field_composerContext ctx) {
        // field_composer : FIELD_C SPACE* valid_text_with_number end_of_line;
        stack.push(ctx.valid_text_with_number().getText());
        stack.push(ctx.FIELD_C().getText());
    }

    @Override
    public void enterOctave(OctaveContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitOctave(OctaveContext ctx) {
        // TODO: TEST IF IT CREATES A LIST OF COMMA/APOSTROPHE IF WE HAVE ONLY
        // ONE OF THESE!
        // octave : APOSTROPHE+ | COMMA+;
        int octaveValue = 0;

        // Creating a new int according to the node we are visiting.
        if (ctx.COMMA() != null) {
            octaveValue = ctx.COMMA().size();
        } else if (ctx.APOSTROPHE() != null) {
            octaveValue = ctx.APOSTROPHE().size();
        }
        stack.push(octaveValue);

    }

    @Override
    public void enterNote_or_rest(Note_or_restContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitNote_or_rest(Note_or_restContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterLyric(LyricContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitLyric(LyricContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterField_default_length(Field_default_lengthContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitField_default_length(Field_default_lengthContext ctx) {
        /*
         * Definition in the project's website: If there is no 'L' field
         * defined, a unit note length is set based on the meter: if it is less
         * than 0.75 the default unit note length is a sixteenth note; if it is
         * 0.75 or greater, it is an eighth note. For example, 2/4 = 0.5, so,
         * the default unit note length is a sixteenth note, while for 4/4 =
         * 1.0, or 6/8 = 0.75, or 3/4= 0.75, it is an eighth note. Notice that
         * if neither 'M' nor 'L' fields are present, the default note length is
         * an eighth.
         * 
         * field_default_length : FIELD_L SPACE* note_length_strict end_of_line;
         */
        stack.push(ctx.note_length_strict().getText());
        stack.push(ctx.FIELD_L().getText());
    }

    @Override
    public void enterKey_accidental(Key_accidentalContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitKey_accidental(Key_accidentalContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterMode_minor(Mode_minorContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitMode_minor(Mode_minorContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterField_meter(Field_meterContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitField_meter(Field_meterContext ctx) {
        /*
         * When the field 'M' is omitted, the default value for meter is 4/4.
         * field_meter : FIELD_M SPACE* meter end_of_line;
         */
        stack.push(ctx.meter().getText());
        stack.push(ctx.FIELD_M().getText());
    }

    @Override
    public void enterField_number(Field_numberContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitField_number(Field_numberContext ctx) {
        // field_number : FIELD_X SPACE* NUMBER end_of_line
        stack.push(ctx.NUMBER().toString());
        stack.push(ctx.FIELD_X().toString());
    }

    @Override
    public void enterRest(RestContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitRest(RestContext ctx) {
        // rest : LOWERCASE_Z;
        stack.push('z');
    }

    @Override
    public void enterComment(CommentContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitComment(CommentContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void enterField_title(Field_titleContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitField_title(Field_titleContext ctx) {
        // field_title : FIELD_T SPACE* valid_text_with_number end_of_line;
        stack.push(ctx.valid_text_with_number().getText());
        stack.push(ctx.FIELD_T().toString());
    }

    @Override
    public void enterPitch(PitchContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitPitch(PitchContext ctx) {
        // Remember that if it hass a natural accent, the accidental value will
        // be 8.

        // pitch : accidental? basenote octave?;

        int octave = (ctx.octave() != null) ? (int) stack.pop() : 0;
        char c = (char) stack.pop();
        int accidental = (ctx.accidental() != null) ? (int) stack.pop() : 0;

        // checking if has an accidental (remember that at this point, the
        // neutral would be an 8)
        boolean hasAccidental = (accidental != 0);

        // if lowercase, we need to raise one octave!
        if (Character.isLowerCase(c))
            octave++;

        // reverting our "neutral-key-accidental-hack" by assigning an
        // accidental of 0 to the value.
        if (accidental == 8)
            accidental = 0;

        Pitch p = new Pitch(Character.toUpperCase(c), accidental, octave,
                hasAccidental);
        stack.push(p);
    }

    @Override
    public void enterField_voice(Field_voiceContext ctx) {
        // TODO Auto-generated method stub

    }

    @Override
    public void exitField_voice(Field_voiceContext ctx) {
        // TODO Auto-generated method stub

    }

}
