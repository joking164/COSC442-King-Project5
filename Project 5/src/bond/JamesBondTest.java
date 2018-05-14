package bond;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JamesBondTest {

	String pattern = "0";
	
	@Test
	public void testCase0() 
	{
	assertTrue("0".matches(pattern));
	}
	@Test
	public void testCase1() 
	{
	assertTrue("00".matches(pattern));
	}
	@Test
	public void testCase2() 
	{
	assertTrue("000".matches(pattern));
	}
	@Test
	public void testCase3() 
	{
	assertTrue("001".matches(pattern));
	}
	@Test
	public void testCase4() 
	{
	assertTrue("002".matches(pattern));
	}
	@Test
	public void testCase5() 
	{
	assertTrue("01".matches(pattern));
	}
	@Test
	public void testCase6() 
	{
	assertTrue("010".matches(pattern));
	}
	@Test
	public void testCase7() 
	{
	assertTrue("0100".matches(pattern));
	}
	@Test
	public void testCase8() 
	{
	assertTrue("0101".matches(pattern));
	}
	@Test
	public void testCase9() 
	{
	assertTrue("0102".matches(pattern));
	}
	@Test
	public void testCase10() 
	{
	assertTrue("011".matches(pattern));
	}
	@Test
	public void testCase11() 
	{
	assertTrue("0110".matches(pattern));
	}
	@Test
	public void testCase12() 
	{
	assertTrue("0111".matches(pattern));
	}
	@Test
	public void testCase13() 
	{
	assertTrue("0112".matches(pattern));
	}
	@Test
	public void testCase14() 
	{
	assertTrue("012".matches(pattern));
	}
	@Test
	public void testCase15() 
	{
	assertTrue("0120".matches(pattern));
	}
	@Test
	public void testCase16() 
	{
	assertTrue("01200".matches(pattern));
	}
	@Test
	public void testCase17() 
	{
	assertTrue("01201".matches(pattern));
	}
	@Test
	public void testCase18() 
	{
	assertTrue("01202".matches(pattern));
	}
	@Test
	public void testCase19() 
	{
	assertTrue("0121".matches(pattern));
	}
	@Test
	public void testCase20() 
	{
	assertTrue("01210".matches(pattern));
	}
	@Test
	public void testCase21() 
	{
	assertTrue("01211".matches(pattern));
	}
	@Test
	public void testCase22() 
	{
	assertTrue("01212".matches(pattern));
	}
	@Test
	public void testCase23() 
	{
	assertTrue("0122".matches(pattern));
	}
	@Test
	public void testCase24() 
	{
	assertTrue("01220".matches(pattern));
	}
	@Test
	public void testCase25() 
	{
	assertTrue("01221".matches(pattern));
	}
	@Test
	public void testCase26() 
	{
	assertTrue("01222".matches(pattern));
	}
	@Test
	public void testCase27() 
	{
	assertTrue("01230".matches(pattern));
	}
	@Test
	public void testCase28() 
	{
	assertTrue("01231".matches(pattern));
	}
	@Test
	public void testCase29() 
	{
	assertTrue("01232".matches(pattern));
	}
	@Test
	public void testCase30() 
	{
	assertTrue("01240".matches(pattern));
	}
	@Test
	public void testCase31() 
	{
	assertTrue("01241".matches(pattern));
	}
	@Test
	public void testCase32() 
	{
	assertTrue("01242".matches(pattern));
	}
	@Test
	public void testCase33() 
	{
	assertTrue("01250".matches(pattern));
	}
	@Test
	public void testCase34() 
	{
	assertTrue("01251".matches(pattern));
	}
	@Test
	public void testCase35() 
	{
	assertTrue("01252".matches(pattern));
	}
	@Test
	public void testCase36() 
	{
	assertTrue("01260".matches(pattern));
	}
	@Test
	public void testCase37() 
	{
	assertTrue("01261".matches(pattern));
	}
	@Test
	public void testCase38() 
	{
	assertTrue("01262".matches(pattern));
	}
	@Test
	public void testCase39() 
	{
	assertTrue("01270".matches(pattern));
	}
	@Test
	public void testCase40() 
	{
	assertTrue("01271".matches(pattern));
	}
	@Test
	public void testCase41() 
	{
	assertTrue("01272".matches(pattern));
	}
	@Test
	public void testCase42() 
	{
	assertTrue("01280".matches(pattern));
	}
	@Test
	public void testCase43() 
	{
	assertTrue("01281".matches(pattern));
	}
	@Test
	public void testCase44() 
	{
	assertTrue("01282".matches(pattern));
	}
	@Test
	public void testCase45() 
	{
	assertTrue("01290".matches(pattern));
	}
	@Test
	public void testCase46() 
	{
	assertTrue("01291".matches(pattern));
	}
	@Test
	public void testCase47() 
	{
	assertTrue("01292".matches(pattern));
	}
	@Test
	public void testCase48() 
	{
	assertTrue("0130".matches(pattern));
	}
	@Test
	public void testCase49() 
	{
	assertTrue("0131".matches(pattern));
	}
	@Test
	public void testCase50() 
	{
	assertTrue("0132".matches(pattern));
	}
	@Test
	public void testCase51() 
	{
	assertTrue("0140".matches(pattern));
	}
	@Test
	public void testCase52() 
	{
	assertTrue("0141".matches(pattern));
	}
	@Test
	public void testCase53() 
	{
	assertTrue("0142".matches(pattern));
	}
	@Test
	public void testCase54() 
	{
	assertTrue("0150".matches(pattern));
	}
	@Test
	public void testCase55() 
	{
	assertTrue("0151".matches(pattern));
	}
	@Test
	public void testCase56() 
	{
	assertTrue("0152".matches(pattern));
	}
	@Test
	public void testCase57() 
	{
	assertTrue("0160".matches(pattern));
	}
	@Test
	public void testCase58() 
	{
	assertTrue("0161".matches(pattern));
	}
	@Test
	public void testCase59() 
	{
	assertTrue("0162".matches(pattern));
	}
	@Test
	public void testCase60() 
	{
	assertTrue("0170".matches(pattern));
	}
	@Test
	public void testCase61() 
	{
	assertTrue("0171".matches(pattern));
	}
	@Test
	public void testCase62() 
	{
	assertTrue("0172".matches(pattern));
	}
	@Test
	public void testCase63() 
	{
	assertTrue("0180".matches(pattern));
	}
	@Test
	public void testCase64() 
	{
	assertTrue("0181".matches(pattern));
	}
	@Test
	public void testCase65() 
	{
	assertTrue("0182".matches(pattern));
	}
	@Test
	public void testCase66() 
	{
	assertTrue("0190".matches(pattern));
	}
	@Test
	public void testCase67() 
	{
	assertTrue("0191".matches(pattern));
	}
	@Test
	public void testCase68() 
	{
	assertTrue("0192".matches(pattern));
	}
	@Test
	public void testCase69() 
	{
	assertTrue("02".matches(pattern));
	}
	@Test
	public void testCase70() 
	{
	assertTrue("020".matches(pattern));
	}
	@Test
	public void testCase71() 
	{
	assertTrue("021".matches(pattern));
	}
	@Test
	public void testCase72() 
	{
	assertTrue("022".matches(pattern));
	}
	@Test
	public void testCase73() 
	{
	assertTrue("030".matches(pattern));
	}
	@Test
	public void testCase74() 
	{
	assertTrue("031".matches(pattern));
	}
	@Test
	public void testCase75() 
	{
	assertTrue("032".matches(pattern));
	}
	@Test
	public void testCase76() 
	{
	assertTrue("040".matches(pattern));
	}
	@Test
	public void testCase77() 
	{
	assertTrue("041".matches(pattern));
	}
	@Test
	public void testCase78() 
	{
	assertTrue("042".matches(pattern));
	}
	@Test
	public void testCase79() 
	{
	assertTrue("050".matches(pattern));
	}
	@Test
	public void testCase80() 
	{
	assertTrue("051".matches(pattern));
	}
	@Test
	public void testCase81() 
	{
	assertTrue("052".matches(pattern));
	}
	@Test
	public void testCase82() 
	{
	assertTrue("060".matches(pattern));
	}
	@Test
	public void testCase83() 
	{
	assertTrue("061".matches(pattern));
	}
	@Test
	public void testCase84() 
	{
	assertTrue("062".matches(pattern));
	}
	@Test
	public void testCase85() 
	{
	assertTrue("070".matches(pattern));
	}
	@Test
	public void testCase86() 
	{
	assertTrue("071".matches(pattern));
	}
	@Test
	public void testCase87() 
	{
	assertTrue("072".matches(pattern));
	}
	@Test
	public void testCase88() 
	{
	assertTrue("080".matches(pattern));
	}
	@Test
	public void testCase89() 
	{
	assertTrue("081".matches(pattern));
	}
	@Test
	public void testCase90() 
	{
	assertTrue("082".matches(pattern));
	}
	@Test
	public void testCase91() 
	{
	assertTrue("090".matches(pattern));
	}
	@Test
	public void testCase92() 
	{
	assertTrue("091".matches(pattern));
	}
	@Test
	public void testCase93() 
	{
	assertTrue("092".matches(pattern));
	}
	@Test
	public void testCase94() 
	{
	assertFalse("1".matches(pattern));
	}
	@Test
	public void testCase95() 
	{
	assertTrue("10".matches(pattern));
	}
	@Test
	public void testCase96() 
	{
	assertFalse("11".matches(pattern));
	}
	@Test
	public void testCase97() 
	{
	assertFalse("12".matches(pattern));
	}
	@Test
	public void testCase98() 
	{
	assertFalse("2".matches(pattern));
	}
	@Test
	public void testCase99() 
	{
	assertTrue("20".matches(pattern));
	}
	@Test
	public void testCase100() 
	{
	assertFalse("21".matches(pattern));
	}
	@Test
	public void testCase101() 
	{
	assertFalse("22".matches(pattern));
	}
	@Test
	public void testCase102() 
	{
	assertTrue("30".matches(pattern));
	}
	@Test
	public void testCase103() 
	{
	assertFalse("31".matches(pattern));
	}
	@Test
	public void testCase104() 
	{
	assertFalse("32".matches(pattern));
	}
	@Test
	public void testCase105() 
	{
	assertTrue("40".matches(pattern));
	}
	@Test
	public void testCase106() 
	{
	assertFalse("41".matches(pattern));
	}
	@Test
	public void testCase107() 
	{
	assertFalse("42".matches(pattern));
	}
	@Test
	public void testCase108() 
	{
	assertTrue("50".matches(pattern));
	}
	@Test
	public void testCase109() 
	{
	assertFalse("51".matches(pattern));
	}
	@Test
	public void testCase110() 
	{
	assertFalse("52".matches(pattern));
	}
	@Test
	public void testCase111() 
	{
	assertTrue("60".matches(pattern));
	}
	@Test
	public void testCase112() 
	{
	assertFalse("61".matches(pattern));
	}
	@Test
	public void testCase113() 
	{
	assertFalse("62".matches(pattern));
	}
	@Test
	public void testCase114() 
	{
	assertTrue("70".matches(pattern));
	}
	@Test
	public void testCase115() 
	{
	assertFalse("71".matches(pattern));
	}
	@Test
	public void testCase116() 
	{
	assertFalse("72".matches(pattern));
	}
	@Test
	public void testCase117() 
	{
	assertTrue("80".matches(pattern));
	}
	@Test
	public void testCase118() 
	{
	assertFalse("81".matches(pattern));
	}
	@Test
	public void testCase119() 
	{
	assertFalse("82".matches(pattern));
	}
	@Test
	public void testCase120() 
	{
	assertTrue("90".matches(pattern));
	}
	@Test
	public void testCase121() 
	{
	assertFalse("91".matches(pattern));
	}
	@Test
	public void testCase122() 
	{
	assertFalse("92".matches(pattern));
	}

}
