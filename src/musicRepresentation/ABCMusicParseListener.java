package musicRepresentation;

import grammar.ABCMusicListener;
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

public class ABCMusicParseListener implements ABCMusicListener {

    private static Stack stack = new Stack();
    
    public ABCHeader getHeader() {
        return (ABCHeader)stack.pop();
    }
    
    public Map<String,Voice> getVoiceMap() {
        return (Map<String,Voice>)stack.pop();
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
        // TODO Auto-generated method stub
        
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
        // TODO Auto-generated method stub
        
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
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterNote_length(Note_lengthContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitNote_length(Note_lengthContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterValid_note(Valid_noteContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitValid_note(Valid_noteContext ctx) {
        // TODO Auto-generated method stub
        
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
        // TODO Auto-generated method stub
        
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
        // TODO Auto-generated method stub
        
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
        // TODO Auto-generated method stub
        
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
        // TODO Auto-generated method stub
        
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
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterOctave(OctaveContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitOctave(OctaveContext ctx) {
        // TODO Auto-generated method stub
        
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
        // TODO Auto-generated method stub
        
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
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterField_number(Field_numberContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitField_number(Field_numberContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterRest(RestContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitRest(RestContext ctx) {
        // TODO Auto-generated method stub
        
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
        // TODO Auto-generated method stub
        
    }

    @Override
    public void enterPitch(PitchContext ctx) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void exitPitch(PitchContext ctx) {
        // TODO Auto-generated method stub
        
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