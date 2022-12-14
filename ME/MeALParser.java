// Generated from MeAL.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MeALParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, CTE=15, CADEIA=16, IDENTIFIER=17, 
		BOOLEAN=18, OPAD=19, OPMULT=20, OPLOG=21, OPNEG=22, OPREL=23, PVIG=24, 
		PONTO=25, DPONTOS=26, VIG=27, ABPAR=28, FPAR=29, ATRIB=30, RESERVADA=31, 
		WS=32, COMENTARIO=33;
	public static final int
		RULE_prog = 0, RULE_decls = 1, RULE_listDecl = 2, RULE_declTip = 3, RULE_listId = 4, 
		RULE_tip = 5, RULE_cmdComp = 6, RULE_listCmd = 7, RULE_cmd = 8, RULE_cmdIf = 9, 
		RULE_cmdWhile = 10, RULE_cmdRead = 11, RULE_cmdWrite = 12, RULE_listW = 13, 
		RULE_elemW = 14, RULE_cmdAtrib = 15, RULE_expr = 16, RULE_exprBool = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decls", "listDecl", "declTip", "listId", "tip", "cmdComp", "listCmd", 
			"cmd", "cmdIf", "cmdWhile", "cmdRead", "cmdWrite", "listW", "elemW", 
			"cmdAtrib", "expr", "exprBool"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'VAR'", "'STRING'", "'INTEGER'", "'BOOLEAN'", "'BEGIN'", 
			"'END'", "'IF'", "'THEN'", "'ELSE'", "'WHILE'", "'DO'", "'READ'", "'WRITE'", 
			null, null, null, null, null, null, null, "'~'", null, "';'", "'.'", 
			"':'", "','", "'('", "')'", "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "CTE", "CADEIA", "IDENTIFIER", "BOOLEAN", "OPAD", "OPMULT", 
			"OPLOG", "OPNEG", "OPREL", "PVIG", "PONTO", "DPONTOS", "VIG", "ABPAR", 
			"FPAR", "ATRIB", "RESERVADA", "WS", "COMENTARIO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MeAL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MeALParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MeALParser.IDENTIFIER, 0); }
		public TerminalNode PVIG() { return getToken(MeALParser.PVIG, 0); }
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public CmdCompContext cmdComp() {
			return getRuleContext(CmdCompContext.class,0);
		}
		public TerminalNode PONTO() { return getToken(MeALParser.PONTO, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(T__0);
				setState(37);
				match(IDENTIFIER);
				setState(38);
				match(PVIG);
				setState(39);
				decls();
				setState(40);
				cmdComp();
				setState(41);
				match(PONTO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(T__0);
				setState(44);
				match(IDENTIFIER);
				setState(45);
				match(PVIG);
				setState(46);
				cmdComp();
				setState(47);
				match(PONTO);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclsContext extends ParserRuleContext {
		public ListDeclContext listDecl() {
			return getRuleContext(ListDeclContext.class,0);
		}
		public DeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).enterDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).exitDecls(this);
		}
	}

	public final DeclsContext decls() throws RecognitionException {
		DeclsContext _localctx = new DeclsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__1);
			setState(52);
			listDecl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListDeclContext extends ParserRuleContext {
		public DeclTipContext declTip() {
			return getRuleContext(DeclTipContext.class,0);
		}
		public ListDeclContext listDecl() {
			return getRuleContext(ListDeclContext.class,0);
		}
		public ListDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).enterListDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).exitListDecl(this);
		}
	}

	public final ListDeclContext listDecl() throws RecognitionException {
		ListDeclContext _localctx = new ListDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_listDecl);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				declTip();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				declTip();
				setState(56);
				listDecl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclTipContext extends ParserRuleContext {
		public ListIdContext listId() {
			return getRuleContext(ListIdContext.class,0);
		}
		public TerminalNode DPONTOS() { return getToken(MeALParser.DPONTOS, 0); }
		public TipContext tip() {
			return getRuleContext(TipContext.class,0);
		}
		public TerminalNode PVIG() { return getToken(MeALParser.PVIG, 0); }
		public DeclTipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declTip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).enterDeclTip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).exitDeclTip(this);
		}
	}

	public final DeclTipContext declTip() throws RecognitionException {
		DeclTipContext _localctx = new DeclTipContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declTip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			listId();
			setState(61);
			match(DPONTOS);
			setState(62);
			tip();
			setState(63);
			match(PVIG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MeALParser.IDENTIFIER, 0); }
		public TerminalNode VIG() { return getToken(MeALParser.VIG, 0); }
		public ListIdContext listId() {
			return getRuleContext(ListIdContext.class,0);
		}
		public ListIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).enterListId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).exitListId(this);
		}
	}

	public final ListIdContext listId() throws RecognitionException {
		ListIdContext _localctx = new ListIdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_listId);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(IDENTIFIER);
				setState(67);
				match(VIG);
				setState(68);
				listId();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipContext extends ParserRuleContext {
		public TipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).enterTip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).exitTip(this);
		}
	}

	public final TipContext tip() throws RecognitionException {
		TipContext _localctx = new TipContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdCompContext extends ParserRuleContext {
		public ListCmdContext listCmd() {
			return getRuleContext(ListCmdContext.class,0);
		}
		public CmdCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdComp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).enterCmdComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).exitCmdComp(this);
		}
	}

	public final CmdCompContext cmdComp() throws RecognitionException {
		CmdCompContext _localctx = new CmdCompContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdComp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__5);
			setState(74);
			listCmd();
			setState(75);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListCmdContext extends ParserRuleContext {
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public TerminalNode PVIG() { return getToken(MeALParser.PVIG, 0); }
		public ListCmdContext listCmd() {
			return getRuleContext(ListCmdContext.class,0);
		}
		public ListCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).enterListCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).exitListCmd(this);
		}
	}

	public final ListCmdContext listCmd() throws RecognitionException {
		ListCmdContext _localctx = new ListCmdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listCmd);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				cmd();
				setState(78);
				match(PVIG);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				cmd();
				setState(81);
				match(PVIG);
				setState(82);
				listCmd();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public CmdIfContext cmdIf() {
			return getRuleContext(CmdIfContext.class,0);
		}
		public CmdWhileContext cmdWhile() {
			return getRuleContext(CmdWhileContext.class,0);
		}
		public CmdReadContext cmdRead() {
			return getRuleContext(CmdReadContext.class,0);
		}
		public CmdWriteContext cmdWrite() {
			return getRuleContext(CmdWriteContext.class,0);
		}
		public CmdAtribContext cmdAtrib() {
			return getRuleContext(CmdAtribContext.class,0);
		}
		public CmdCompContext cmdComp() {
			return getRuleContext(CmdCompContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmd);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				cmdIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				cmdWhile();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				cmdRead();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				cmdWrite();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				cmdAtrib();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				cmdAtrib();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				cmdComp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdIfContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).enterCmdIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).exitCmdIf(this);
		}
	}

	public final CmdIfContext cmdIf() throws RecognitionException {
		CmdIfContext _localctx = new CmdIfContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdIf);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(T__7);
				setState(96);
				expr();
				setState(97);
				match(T__8);
				setState(98);
				cmd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(T__7);
				setState(101);
				expr();
				setState(102);
				match(T__8);
				setState(103);
				cmd();
				setState(104);
				match(T__9);
				setState(105);
				cmd();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdWhileContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public CmdWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).enterCmdWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).exitCmdWhile(this);
		}
	}

	public final CmdWhileContext cmdWhile() throws RecognitionException {
		CmdWhileContext _localctx = new CmdWhileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdWhile);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(T__10);
				setState(110);
				expr();
				setState(111);
				match(T__11);
				setState(112);
				cmd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(T__10);
				setState(115);
				exprBool();
				setState(116);
				match(T__11);
				setState(117);
				cmd();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdReadContext extends ParserRuleContext {
		public TerminalNode ABPAR() { return getToken(MeALParser.ABPAR, 0); }
		public ListIdContext listId() {
			return getRuleContext(ListIdContext.class,0);
		}
		public TerminalNode FPAR() { return getToken(MeALParser.FPAR, 0); }
		public CmdReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).enterCmdRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).exitCmdRead(this);
		}
	}

	public final CmdReadContext cmdRead() throws RecognitionException {
		CmdReadContext _localctx = new CmdReadContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmdRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__12);
			setState(122);
			match(ABPAR);
			setState(123);
			listId();
			setState(124);
			match(FPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdWriteContext extends ParserRuleContext {
		public TerminalNode ABPAR() { return getToken(MeALParser.ABPAR, 0); }
		public ListWContext listW() {
			return getRuleContext(ListWContext.class,0);
		}
		public TerminalNode FPAR() { return getToken(MeALParser.FPAR, 0); }
		public CmdWriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWrite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).enterCmdWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).exitCmdWrite(this);
		}
	}

	public final CmdWriteContext cmdWrite() throws RecognitionException {
		CmdWriteContext _localctx = new CmdWriteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cmdWrite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__13);
			setState(127);
			match(ABPAR);
			setState(128);
			listW();
			setState(129);
			match(FPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListWContext extends ParserRuleContext {
		public ElemWContext elemW() {
			return getRuleContext(ElemWContext.class,0);
		}
		public TerminalNode VIG() { return getToken(MeALParser.VIG, 0); }
		public ListWContext listW() {
			return getRuleContext(ListWContext.class,0);
		}
		public ListWContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listW; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).enterListW(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).exitListW(this);
		}
	}

	public final ListWContext listW() throws RecognitionException {
		ListWContext _localctx = new ListWContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_listW);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				elemW();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				elemW();
				setState(133);
				match(VIG);
				setState(134);
				listW();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElemWContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(MeALParser.CADEIA, 0); }
		public ElemWContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemW; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).enterElemW(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).exitElemW(this);
		}
	}

	public final ElemWContext elemW() throws RecognitionException {
		ElemWContext _localctx = new ElemWContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elemW);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(CADEIA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdAtribContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MeALParser.IDENTIFIER, 0); }
		public TerminalNode ATRIB() { return getToken(MeALParser.ATRIB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CmdAtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).enterCmdAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).exitCmdAtrib(this);
		}
	}

	public final CmdAtribContext cmdAtrib() throws RecognitionException {
		CmdAtribContext _localctx = new CmdAtribContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cmdAtrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(IDENTIFIER);
			setState(143);
			match(ATRIB);
			setState(144);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode CTE() { return getToken(MeALParser.CTE, 0); }
		public TerminalNode OPREL() { return getToken(MeALParser.OPREL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OPAD() { return getToken(MeALParser.OPAD, 0); }
		public TerminalNode OPMULT() { return getToken(MeALParser.OPMULT, 0); }
		public TerminalNode ABPAR() { return getToken(MeALParser.ABPAR, 0); }
		public TerminalNode FPAR() { return getToken(MeALParser.FPAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MeALParser.IDENTIFIER, 0); }
		public TerminalNode OPLOG() { return getToken(MeALParser.OPLOG, 0); }
		public TerminalNode ATRIB() { return getToken(MeALParser.ATRIB, 0); }
		public TerminalNode OPNEG() { return getToken(MeALParser.OPNEG, 0); }
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(MeALParser.CADEIA, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr);
		int _la;
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(CTE);
				setState(147);
				match(OPREL);
				setState(148);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(CTE);
				setState(150);
				match(OPAD);
				setState(151);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				match(CTE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				match(CTE);
				setState(154);
				match(OPMULT);
				setState(155);
				expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				match(ABPAR);
				setState(157);
				expr();
				setState(158);
				match(FPAR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				match(IDENTIFIER);
				setState(161);
				match(OPREL);
				setState(162);
				expr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(163);
				match(IDENTIFIER);
				setState(164);
				match(OPAD);
				setState(165);
				expr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(166);
				match(IDENTIFIER);
				setState(167);
				match(OPMULT);
				setState(168);
				expr();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(169);
				match(IDENTIFIER);
				setState(170);
				match(OPLOG);
				setState(171);
				expr();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(172);
				match(IDENTIFIER);
				setState(173);
				match(ATRIB);
				setState(174);
				expr();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPNEG) {
					{
					setState(175);
					match(OPNEG);
					}
				}

				setState(178);
				match(IDENTIFIER);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPNEG) {
					{
					setState(179);
					match(OPNEG);
					}
				}

				setState(182);
				match(ABPAR);
				setState(183);
				exprBool();
				setState(184);
				match(FPAR);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(186);
				exprBool();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(187);
				match(IDENTIFIER);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(188);
				match(CADEIA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprBoolContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MeALParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MeALParser.IDENTIFIER, i);
		}
		public List<TerminalNode> CTE() { return getTokens(MeALParser.CTE); }
		public TerminalNode CTE(int i) {
			return getToken(MeALParser.CTE, i);
		}
		public TerminalNode ABPAR() { return getToken(MeALParser.ABPAR, 0); }
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public TerminalNode FPAR() { return getToken(MeALParser.FPAR, 0); }
		public TerminalNode OPREL() { return getToken(MeALParser.OPREL, 0); }
		public TerminalNode BOOLEAN() { return getToken(MeALParser.BOOLEAN, 0); }
		public TerminalNode OPNEG() { return getToken(MeALParser.OPNEG, 0); }
		public ExprBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprBool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).enterExprBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeALListener ) ((MeALListener)listener).exitExprBool(this);
		}
	}

	public final ExprBoolContext exprBool() throws RecognitionException {
		ExprBoolContext _localctx = new ExprBoolContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exprBool);
		int _la;
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(CTE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				match(ABPAR);
				setState(194);
				exprBool();
				setState(195);
				match(FPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				match(IDENTIFIER);
				setState(198);
				match(OPREL);
				setState(199);
				match(IDENTIFIER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
				match(CTE);
				setState(201);
				match(OPREL);
				setState(202);
				match(CTE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				match(CTE);
				setState(204);
				match(OPREL);
				setState(205);
				match(IDENTIFIER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(206);
				match(IDENTIFIER);
				setState(207);
				match(OPREL);
				setState(208);
				match(CTE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(209);
				match(IDENTIFIER);
				setState(210);
				match(OPREL);
				setState(211);
				match(BOOLEAN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPNEG) {
					{
					setState(212);
					match(OPNEG);
					}
				}

				setState(215);
				match(BOOLEAN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00dd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\64"+
		"\n\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4=\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\5\6H\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\tW\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n`\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13n\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\fz\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u008b\n\17\3\20\3\20\5\20\u008f\n\20\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\5\22\u00b3\n\22\3\22\3\22\5\22\u00b7\n\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c0\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00d8\n\23\3\23\5\23\u00db\n\23\3\23\2\2\24"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\3\3\2\5\7\2\u00f1\2\63\3"+
		"\2\2\2\4\65\3\2\2\2\6<\3\2\2\2\b>\3\2\2\2\nG\3\2\2\2\fI\3\2\2\2\16K\3"+
		"\2\2\2\20V\3\2\2\2\22_\3\2\2\2\24m\3\2\2\2\26y\3\2\2\2\30{\3\2\2\2\32"+
		"\u0080\3\2\2\2\34\u008a\3\2\2\2\36\u008e\3\2\2\2 \u0090\3\2\2\2\"\u00bf"+
		"\3\2\2\2$\u00da\3\2\2\2&\'\7\3\2\2\'(\7\23\2\2()\7\32\2\2)*\5\4\3\2*+"+
		"\5\16\b\2+,\7\33\2\2,\64\3\2\2\2-.\7\3\2\2./\7\23\2\2/\60\7\32\2\2\60"+
		"\61\5\16\b\2\61\62\7\33\2\2\62\64\3\2\2\2\63&\3\2\2\2\63-\3\2\2\2\64\3"+
		"\3\2\2\2\65\66\7\4\2\2\66\67\5\6\4\2\67\5\3\2\2\28=\5\b\5\29:\5\b\5\2"+
		":;\5\6\4\2;=\3\2\2\2<8\3\2\2\2<9\3\2\2\2=\7\3\2\2\2>?\5\n\6\2?@\7\34\2"+
		"\2@A\5\f\7\2AB\7\32\2\2B\t\3\2\2\2CH\7\23\2\2DE\7\23\2\2EF\7\35\2\2FH"+
		"\5\n\6\2GC\3\2\2\2GD\3\2\2\2H\13\3\2\2\2IJ\t\2\2\2J\r\3\2\2\2KL\7\b\2"+
		"\2LM\5\20\t\2MN\7\t\2\2N\17\3\2\2\2OP\5\22\n\2PQ\7\32\2\2QW\3\2\2\2RS"+
		"\5\22\n\2ST\7\32\2\2TU\5\20\t\2UW\3\2\2\2VO\3\2\2\2VR\3\2\2\2W\21\3\2"+
		"\2\2X`\5\24\13\2Y`\5\26\f\2Z`\5\30\r\2[`\5\32\16\2\\`\5 \21\2]`\5 \21"+
		"\2^`\5\16\b\2_X\3\2\2\2_Y\3\2\2\2_Z\3\2\2\2_[\3\2\2\2_\\\3\2\2\2_]\3\2"+
		"\2\2_^\3\2\2\2`\23\3\2\2\2ab\7\n\2\2bc\5\"\22\2cd\7\13\2\2de\5\22\n\2"+
		"en\3\2\2\2fg\7\n\2\2gh\5\"\22\2hi\7\13\2\2ij\5\22\n\2jk\7\f\2\2kl\5\22"+
		"\n\2ln\3\2\2\2ma\3\2\2\2mf\3\2\2\2n\25\3\2\2\2op\7\r\2\2pq\5\"\22\2qr"+
		"\7\16\2\2rs\5\22\n\2sz\3\2\2\2tu\7\r\2\2uv\5$\23\2vw\7\16\2\2wx\5\22\n"+
		"\2xz\3\2\2\2yo\3\2\2\2yt\3\2\2\2z\27\3\2\2\2{|\7\17\2\2|}\7\36\2\2}~\5"+
		"\n\6\2~\177\7\37\2\2\177\31\3\2\2\2\u0080\u0081\7\20\2\2\u0081\u0082\7"+
		"\36\2\2\u0082\u0083\5\34\17\2\u0083\u0084\7\37\2\2\u0084\33\3\2\2\2\u0085"+
		"\u008b\5\36\20\2\u0086\u0087\5\36\20\2\u0087\u0088\7\35\2\2\u0088\u0089"+
		"\5\34\17\2\u0089\u008b\3\2\2\2\u008a\u0085\3\2\2\2\u008a\u0086\3\2\2\2"+
		"\u008b\35\3\2\2\2\u008c\u008f\5\"\22\2\u008d\u008f\7\22\2\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008d\3\2\2\2\u008f\37\3\2\2\2\u0090\u0091\7\23\2\2\u0091"+
		"\u0092\7 \2\2\u0092\u0093\5\"\22\2\u0093!\3\2\2\2\u0094\u0095\7\21\2\2"+
		"\u0095\u0096\7\31\2\2\u0096\u00c0\5\"\22\2\u0097\u0098\7\21\2\2\u0098"+
		"\u0099\7\25\2\2\u0099\u00c0\5\"\22\2\u009a\u00c0\7\21\2\2\u009b\u009c"+
		"\7\21\2\2\u009c\u009d\7\26\2\2\u009d\u00c0\5\"\22\2\u009e\u009f\7\36\2"+
		"\2\u009f\u00a0\5\"\22\2\u00a0\u00a1\7\37\2\2\u00a1\u00c0\3\2\2\2\u00a2"+
		"\u00a3\7\23\2\2\u00a3\u00a4\7\31\2\2\u00a4\u00c0\5\"\22\2\u00a5\u00a6"+
		"\7\23\2\2\u00a6\u00a7\7\25\2\2\u00a7\u00c0\5\"\22\2\u00a8\u00a9\7\23\2"+
		"\2\u00a9\u00aa\7\26\2\2\u00aa\u00c0\5\"\22\2\u00ab\u00ac\7\23\2\2\u00ac"+
		"\u00ad\7\27\2\2\u00ad\u00c0\5\"\22\2\u00ae\u00af\7\23\2\2\u00af\u00b0"+
		"\7 \2\2\u00b0\u00c0\5\"\22\2\u00b1\u00b3\7\30\2\2\u00b2\u00b1\3\2\2\2"+
		"\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00c0\7\23\2\2\u00b5\u00b7"+
		"\7\30\2\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2"+
		"\u00b8\u00b9\7\36\2\2\u00b9\u00ba\5$\23\2\u00ba\u00bb\7\37\2\2\u00bb\u00c0"+
		"\3\2\2\2\u00bc\u00c0\5$\23\2\u00bd\u00c0\7\23\2\2\u00be\u00c0\7\22\2\2"+
		"\u00bf\u0094\3\2\2\2\u00bf\u0097\3\2\2\2\u00bf\u009a\3\2\2\2\u00bf\u009b"+
		"\3\2\2\2\u00bf\u009e\3\2\2\2\u00bf\u00a2\3\2\2\2\u00bf\u00a5\3\2\2\2\u00bf"+
		"\u00a8\3\2\2\2\u00bf\u00ab\3\2\2\2\u00bf\u00ae\3\2\2\2\u00bf\u00b2\3\2"+
		"\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00bc\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00be\3\2\2\2\u00c0#\3\2\2\2\u00c1\u00db\7\23\2\2\u00c2\u00db\7\21\2"+
		"\2\u00c3\u00c4\7\36\2\2\u00c4\u00c5\5$\23\2\u00c5\u00c6\7\37\2\2\u00c6"+
		"\u00db\3\2\2\2\u00c7\u00c8\7\23\2\2\u00c8\u00c9\7\31\2\2\u00c9\u00db\7"+
		"\23\2\2\u00ca\u00cb\7\21\2\2\u00cb\u00cc\7\31\2\2\u00cc\u00db\7\21\2\2"+
		"\u00cd\u00ce\7\21\2\2\u00ce\u00cf\7\31\2\2\u00cf\u00db\7\23\2\2\u00d0"+
		"\u00d1\7\23\2\2\u00d1\u00d2\7\31\2\2\u00d2\u00db\7\21\2\2\u00d3\u00d4"+
		"\7\23\2\2\u00d4\u00d5\7\31\2\2\u00d5\u00db\7\24\2\2\u00d6\u00d8\7\30\2"+
		"\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db"+
		"\7\24\2\2\u00da\u00c1\3\2\2\2\u00da\u00c2\3\2\2\2\u00da\u00c3\3\2\2\2"+
		"\u00da\u00c7\3\2\2\2\u00da\u00ca\3\2\2\2\u00da\u00cd\3\2\2\2\u00da\u00d0"+
		"\3\2\2\2\u00da\u00d3\3\2\2\2\u00da\u00d7\3\2\2\2\u00db%\3\2\2\2\20\63"+
		"<GV_my\u008a\u008e\u00b2\u00b6\u00bf\u00d7\u00da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}