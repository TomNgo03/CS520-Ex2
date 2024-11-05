import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.subtract(0, 1322291616);
        int int18 = calculator0.add((-665227), 2085965638);
        int int21 = calculator0.divide((-1730079900), (-3459));
        int int24 = calculator0.add(173435032, 47859271);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1322291616) + "'", int15 == (-1322291616));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2085300411 + "'", int18 == 2085300411);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 500167 + "'", int21 == 500167);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 221294303 + "'", int24 == 221294303);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.subtract((int) (byte) -1, 0);
        int int21 = calculator0.divide((-9312), 867133515);
        int int24 = calculator0.subtract(1237148863, 52);
        int int27 = calculator0.subtract(1754528548, 129903974);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1237148811 + "'", int24 == 1237148811);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1624624574 + "'", int27 == 1624624574);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(1145179144, 100);
        int int15 = calculator0.subtract(1237148811, (-240317368));
        int int18 = calculator0.multiply(86713457, 1257480666);
        int int21 = calculator0.multiply((-1171728053), 1810185237);
        int int24 = calculator0.subtract(1624624574, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1145179044 + "'", int12 == 1145179044);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1477466179 + "'", int15 == 1477466179);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-907339462) + "'", int18 == (-907339462));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1856084185) + "'", int21 == (-1856084185));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1624624574 + "'", int24 == 1624624574);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.subtract((-7955541), (-867133515));
        int int18 = calculator0.add((-867051763), (-1567474935));
        int int21 = calculator0.divide((-493712131), 807706469);
        int int24 = calculator0.multiply(665, 5983);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 859177974 + "'", int15 == 859177974);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1860440598 + "'", int18 == 1860440598);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3978695 + "'", int24 == 3978695);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.subtract((int) (byte) -1, 0);
        int int21 = calculator0.divide((-9312), 867133515);
        int int24 = calculator0.subtract(1237148863, 52);
        int int27 = calculator0.multiply(1271882624, 867133501);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1237148811 + "'", int24 == 1237148811);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-715737728) + "'", int27 == (-715737728));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.multiply((-173426914), 232346435);
        int int18 = calculator0.subtract((-1555994363), (-112));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 272082650 + "'", int15 == 272082650);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1555994251) + "'", int18 == (-1555994251));
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.add(1152037484, (-6858340));
        int int18 = calculator0.divide(4213, 867133667);
        int int21 = calculator0.divide((-296335505), (-339321182));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.divide((-1435799528), (-1673719027));
        int int18 = calculator0.subtract(0, 1968289463);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1968289463) + "'", int18 == (-1968289463));
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.multiply((-101), (int) (short) 10);
        int int18 = calculator0.divide((int) 'a', 196);
        int int21 = calculator0.subtract(114939, 42260032);
        int int24 = calculator0.divide((-172530899), (-59));
        int int27 = calculator0.divide((-35), (-998235993));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1010) + "'", int15 == (-1010));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-42145093) + "'", int21 == (-42145093));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2924252 + "'", int24 == 2924252);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.subtract((-7955541), (-867133515));
        int int18 = calculator0.add((-867051763), (-1567474935));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 859177974 + "'", int15 == 859177974);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1860440598 + "'", int18 == 1860440598);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((-110), (-68));
        int int9 = calculator0.divide(1756652153, (-867138628));
        int int12 = calculator0.divide(378379962, (int) (short) 1);
        int int15 = calculator0.add((-867133431), 110);
        int int18 = calculator0.add(0, (-341775360));
        int int21 = calculator0.add((-1122109787), 641961972);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 378379962 + "'", int12 == 378379962);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133321) + "'", int15 == (-867133321));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-341775360) + "'", int18 == (-341775360));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-480147815) + "'", int21 == (-480147815));
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.subtract((int) (byte) -1, 0);
        int int21 = calculator0.divide(3400, 95);
        int int24 = calculator0.divide(2110251662, (-76265));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-27669) + "'", int24 == (-27669));
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.multiply(284903989, 21975629);
        int int15 = calculator0.subtract((-1556003554), 11);
        int int18 = calculator0.multiply((-1734245508), 0);
        int int21 = calculator0.subtract((-1121822200), 1248234937);
        int int24 = calculator0.divide((-1259188224), (-1984132447));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1263186959) + "'", int12 == (-1263186959));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1556003565) + "'", int15 == (-1556003565));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1924910159 + "'", int21 == 1924910159);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(1219996744, 109415572);
        int int21 = calculator0.subtract(1497046722, (-6867620));
        int int24 = calculator0.add((-376890729), (-1127994));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1503914342 + "'", int21 == 1503914342);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-378018723) + "'", int24 == (-378018723));
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.subtract((int) (byte) -1, (int) (short) -1);
        int int15 = calculator0.add((-6858340), (-9280));
        int int18 = calculator0.divide(897963264, 94);
        int int21 = calculator0.multiply(32, 867133667);
        int int24 = calculator0.divide(1271882624, (-757944310));
        int int27 = calculator0.subtract((-934840507), 2444);
        int int30 = calculator0.subtract(408021504, (-1285850013));
        int int33 = calculator0.divide((-2118403245), 13276316);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6867620) + "'", int15 == (-6867620));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9552800 + "'", int18 == 9552800);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1978473568 + "'", int21 == 1978473568);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-934842951) + "'", int27 == (-934842951));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1693871517 + "'", int30 == 1693871517);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-159) + "'", int33 == (-159));
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.multiply((-9312), (-9312));
        int int15 = calculator0.subtract(867133515, (-6));
        int int18 = calculator0.add(867153943, (-1700666664));
        int int21 = calculator0.subtract(867133521, 1724755534);
        int int24 = calculator0.subtract(0, 22);
        int int27 = calculator0.subtract((-52891664), 134475348);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713344 + "'", int12 == 86713344);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133521 + "'", int15 == 867133521);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-833512721) + "'", int18 == (-833512721));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-857622013) + "'", int21 == (-857622013));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-22) + "'", int24 == (-22));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-187367012) + "'", int27 == (-187367012));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.multiply(1474273060, (-867133566));
        int int15 = calculator0.subtract((-2093236467), 2366375);
        int int18 = calculator0.subtract(100205648, 867133381);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-240317368) + "'", int12 == (-240317368));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2095602842) + "'", int15 == (-2095602842));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-766927733) + "'", int18 == (-766927733));
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.subtract((-1), 9);
        int int18 = calculator0.subtract((-2243320), 86713381);
        int int21 = calculator0.divide((-2115365052), 1754530371);
        int int24 = calculator0.divide(34682041, (-965191816));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-88956701) + "'", int18 == (-88956701));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.subtract(12, (-733999));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 734011 + "'", int15 == 734011);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply(0, 1810705533);
        int int24 = calculator0.divide((-412971054), (-1102996576));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        int int21 = calculator0.divide(101, (-101));
        int int24 = calculator0.add(1810185236, (int) (byte) 1);
        int int27 = calculator0.multiply((-2146806804), 1408199649);
        int int30 = calculator0.multiply(1694298472, (-1163139214));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1810185237 + "'", int24 == 1810185237);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1216649620) + "'", int27 == (-1216649620));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 116414544 + "'", int30 == 116414544);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.add(2118708572, 2);
        int int21 = calculator0.add((-596556766), 1970219360);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2118708574 + "'", int18 == 2118708574);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1373662594 + "'", int21 == 1373662594);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((int) '#', (int) (short) -1);
        int int21 = calculator0.add(101, (-7567));
        int int24 = calculator0.add(164584658, 109413727);
        int int27 = calculator0.add(887396705, (-164593938));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7466) + "'", int21 == (-7466));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 273998385 + "'", int24 == 273998385);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 722802767 + "'", int27 == 722802767);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((int) '#', (int) (short) -1);
        int int21 = calculator0.add(101, (-7567));
        int int24 = calculator0.add(164584658, 109413727);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7466) + "'", int21 == (-7466));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 273998385 + "'", int24 == 273998385);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide((-1769916224), (-36));
        int int21 = calculator0.add(867133591, 76);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 867133667 + "'", int21 == 867133667);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.multiply(34, (-685834));
        int int21 = calculator0.subtract((-74870788), 0);
        int int24 = calculator0.subtract(887128884, (-685834));
        int int27 = calculator0.add(0, 65689586);
        int int30 = calculator0.divide(1737431675, 206282752);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-23318356) + "'", int18 == (-23318356));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-74870788) + "'", int21 == (-74870788));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 887814718 + "'", int24 == 887814718);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 65689586 + "'", int27 == 65689586);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.add((-2146806784), 0);
        int int12 = calculator0.subtract(520297, 96);
        int int15 = calculator0.divide(20580, 780440677);
        int int18 = calculator0.multiply((-1820924517), 1497039730);
        int int21 = calculator0.divide(2020, 65689586);
        int int24 = calculator0.divide((-869367269), (-1145651032));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2146806784) + "'", int9 == (-2146806784));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520201 + "'", int12 == 520201);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-581169146) + "'", int18 == (-581169146));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add(101, (-2020));
        int int12 = calculator0.add(0, 1693566793);
        int int15 = calculator0.divide(86713344, (-1336575495));
        int int18 = calculator0.subtract(253259185, 954669693);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1919) + "'", int9 == (-1919));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1693566793 + "'", int12 == 1693566793);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-701410508) + "'", int18 == (-701410508));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.divide(25, (-1923));
        int int12 = calculator0.multiply((-15300), 34);
        int int15 = calculator0.subtract(1152037484, (-109415563));
        int int18 = calculator0.divide(1810186246, (-78));
        int int21 = calculator0.subtract(1076984144, 197);
        int int24 = calculator0.subtract((-96348159), (-1665941363));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-520200) + "'", int12 == (-520200));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1261453047 + "'", int15 == 1261453047);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-23207515) + "'", int18 == (-23207515));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1076983947 + "'", int21 == 1076983947);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1569593204 + "'", int24 == 1569593204);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.add(1152037484, (-6858340));
        int int18 = calculator0.multiply((-31), 9277);
        int int21 = calculator0.subtract((-88956701), 273998385);
        int int24 = calculator0.multiply((-1475970418), 1739617460);
        int int27 = calculator0.divide(1769444996, (-272082615));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-287587) + "'", int18 == (-287587));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-362955086) + "'", int21 == (-362955086));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2008450008 + "'", int24 == 2008450008);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-6) + "'", int27 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.subtract(0, (-110));
        int int24 = calculator0.divide(213009, (-241122442));
        int int27 = calculator0.add(98, 1013244259);
        int int30 = calculator0.divide((-1556003565), (-109415539));
        int int33 = calculator0.add(887061504, (-6867620));
        int int36 = calculator0.multiply((-934840507), 870696823);
        int int39 = calculator0.multiply((-307225), 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 110 + "'", int21 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1013244357 + "'", int27 == 1013244357);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 14 + "'", int30 == 14);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 880193884 + "'", int33 == 880193884);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 380113939 + "'", int36 == 380113939);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-4608375) + "'", int39 == (-4608375));
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-68), 110);
        int int18 = calculator0.add(1371450554, (-49164339));
        int int21 = calculator0.add(1152037331, (-867133342));
        int int24 = calculator0.divide(1702058646, 1497091025);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1322286215 + "'", int18 == 1322286215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 284903989 + "'", int21 == 284903989);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide((-867133571), (-7600));
        int int21 = calculator0.divide((-109415563), (-26));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 114096 + "'", int18 == 114096);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4208290 + "'", int21 == 4208290);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.add(1152037484, (-6858340));
        int int18 = calculator0.divide(4213, 867133667);
        int int21 = calculator0.subtract((-4864), (-1357151573));
        int int24 = calculator0.subtract(867154009, 10107303);
        int int27 = calculator0.subtract((-547417792), 692692992);
        int int30 = calculator0.multiply((-9312), (-867118337));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1357146709 + "'", int21 == 1357146709);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 857046706 + "'", int24 == 857046706);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1240110784) + "'", int27 == (-1240110784));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 67437664 + "'", int30 == 67437664);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.add((-76), (-76));
        int int27 = calculator0.multiply((-6858340), 3563280);
        int int30 = calculator0.divide((-258), 1152037538);
        int int33 = calculator0.add(326167110, 0);
        int int36 = calculator0.subtract((-164656960), 1237148765);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-152) + "'", int24 == (-152));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 178159040 + "'", int27 == 178159040);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 326167110 + "'", int33 == 326167110);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1401805725) + "'", int36 == (-1401805725));
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.add((-76), (-76));
        int int27 = calculator0.multiply((-6858340), 3563280);
        int int30 = calculator0.subtract((-867133566), 100);
        int int33 = calculator0.subtract(1145179144, (-341775360));
        int int36 = calculator0.subtract((-1424737661), 3563280);
        int int39 = calculator0.subtract((-353341512), (-1410665216));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-152) + "'", int24 == (-152));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 178159040 + "'", int27 == 178159040);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-867133666) + "'", int30 == (-867133666));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1486954504 + "'", int33 == 1486954504);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1428300941) + "'", int36 == (-1428300941));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1057323704 + "'", int39 == 1057323704);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((int) (short) 0, 110);
        int int21 = calculator0.subtract((-207), (-88947591));
        int int24 = calculator0.divide((-290738176), 870696771);
        int int27 = calculator0.multiply(211766202, (-1459544222));
        int int30 = calculator0.subtract((-568590), 0);
        int int33 = calculator0.add((-198788048), (-866521795));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 88947384 + "'", int21 == 88947384);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 887128884 + "'", int27 == 887128884);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-568590) + "'", int30 == (-568590));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1065309843) + "'", int33 == (-1065309843));
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.multiply(0, 210);
        int int18 = calculator0.add((-23318356), 1037464303);
        int int21 = calculator0.subtract(1322286215, 18);
        int int24 = calculator0.subtract((-917640454), (-845157802));
        int int27 = calculator0.multiply((int) (short) 100, (-36));
        int int30 = calculator0.add(1075835744, (-207));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1014145947 + "'", int18 == 1014145947);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1322286197 + "'", int21 == 1322286197);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-72482652) + "'", int24 == (-72482652));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3600) + "'", int27 == (-3600));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1075835537 + "'", int30 == 1075835537);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.subtract(96, 97);
        int int15 = calculator0.multiply((-45), (-23318356));
        int int18 = calculator0.multiply(19670, 0);
        int int21 = calculator0.divide(11, 284903989);
        int int24 = calculator0.divide(976529318, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9765293 + "'", int24 == 9765293);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.multiply(2, (-86713457));
        int int24 = calculator0.add(86713344, 131);
        int int27 = calculator0.subtract(34, (-290738176));
        int int30 = calculator0.add(5419, (-1556003554));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173426914) + "'", int21 == (-173426914));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 86713475 + "'", int24 == 86713475);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 290738210 + "'", int27 == 290738210);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1555998135) + "'", int30 == (-1555998135));
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((-101), (-86));
        int int15 = calculator0.add((-362406912), (-173426797));
        int int18 = calculator0.subtract(2129948464, 1730079900);
        int int21 = calculator0.add((-18090313), (-917629359));
        int int24 = calculator0.subtract((-1850343988), (-828646945));
        int int27 = calculator0.add((-7600), (-1224898));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-15) + "'", int12 == (-15));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-535833709) + "'", int15 == (-535833709));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 399868564 + "'", int18 == 399868564);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-935719672) + "'", int21 == (-935719672));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1021697043) + "'", int24 == (-1021697043));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1232498) + "'", int27 == (-1232498));
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(2243220, (int) '4');
        int int21 = calculator0.subtract((-1121825728), (-3528));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 43138 + "'", int18 == 43138);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1121822200) + "'", int21 == (-1121822200));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.divide(4213, (-7567));
        int int21 = calculator0.divide(1597614332, (-1269639355));
        int int24 = calculator0.add((-1441521995), 955361077);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-486160918) + "'", int24 == (-486160918));
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.add(2118708572, 2);
        int int21 = calculator0.subtract((-867133321), 141744384);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2118708574 + "'", int18 == 2118708574);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1008877705) + "'", int21 == (-1008877705));
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((int) '#', (int) ' ');
        int int18 = calculator0.add(34, (-1010));
        int int21 = calculator0.divide((-1858814996), 1293640882);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-976) + "'", int18 == (-976));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.add(1733678745, (-1740511737));
        int int18 = calculator0.multiply((-563954720), 1610593080);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6832992) + "'", int15 == (-6832992));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-216614656) + "'", int18 == (-216614656));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        int int21 = calculator0.subtract((int) (byte) 1, 32);
        int int24 = calculator0.divide((-86713457), (-2020));
        int int27 = calculator0.add((-88956677), (-867138628));
        int int30 = calculator0.subtract((-9280), (-26411181));
        int int33 = calculator0.divide(537567364, 1700666764);
        int int36 = calculator0.divide((-88956677), 7029297);
        int int39 = calculator0.add((-755028714), (-1891899810));
        int int42 = calculator0.add((-1411233806), 1358002664);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42927 + "'", int24 == 42927);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-956095305) + "'", int27 == (-956095305));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 26401901 + "'", int30 == 26401901);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-12) + "'", int36 == (-12));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1648038772 + "'", int39 == 1648038772);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-53231142) + "'", int42 == (-53231142));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.subtract(0, (-110));
        int int24 = calculator0.divide(213009, (-241122442));
        int int27 = calculator0.add(98, 1013244259);
        int int30 = calculator0.add(417847584, 391608);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 110 + "'", int21 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1013244357 + "'", int27 == 1013244357);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 418239192 + "'", int30 == 418239192);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.divide(692692992, (-1010));
        int int21 = calculator0.add((-241122442), (-757113551));
        int int24 = calculator0.divide((-34682070), (-1121822200));
        int int27 = calculator0.add(0, (-1270709336));
        int int30 = calculator0.add((-1171728053), 334907792);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-685834) + "'", int18 == (-685834));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-998235993) + "'", int21 == (-998235993));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1270709336) + "'", int27 == (-1270709336));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-836820261) + "'", int30 == (-836820261));
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-68), 110);
        int int18 = calculator0.add((-86), (-867133440));
        int int21 = calculator0.add(197, 104749);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-867133526) + "'", int18 == (-867133526));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 104946 + "'", int21 == 104946);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.divide((-1248231612), 1754528548);
        int int21 = calculator0.divide(290738210, (-7600));
        int int24 = calculator0.multiply((-46566313), 266702322);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-38255) + "'", int21 == (-38255));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 808903998 + "'", int24 == 808903998);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply((-76), (-7480));
        int int9 = calculator0.add((-1951649816), 1754528448);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 568480 + "'", int6 == 568480);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-197121368) + "'", int9 == (-197121368));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide((-214132468), (-49164380));
        int int12 = calculator0.add((-609787), (-867133440));
        int int15 = calculator0.multiply((-867158169), (int) (byte) -1);
        int int18 = calculator0.add(1423849605, (-2892));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867743227) + "'", int12 == (-867743227));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867158169 + "'", int15 == 867158169);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1423846713 + "'", int18 == 1423846713);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        int int15 = calculator0.multiply(1978473568, 1810185237);
        int int18 = calculator0.subtract((-1555994343), (-101));
        int int21 = calculator0.add((-51023270), (-917640454));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1057369120) + "'", int15 == (-1057369120));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1555994242) + "'", int18 == (-1555994242));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-968663724) + "'", int21 == (-968663724));
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.divide(1771863899, 827072948);
        int int15 = calculator0.subtract(791316488, 282034071);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 509282417 + "'", int15 == 509282417);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.divide((-173436074), 96);
        int int24 = calculator0.divide((-1806625), (-1559826432));
        int int27 = calculator0.divide((-88956770), (-866613314));
        int int30 = calculator0.subtract((-96347949), (-78119));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1806625) + "'", int21 == (-1806625));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-96269830) + "'", int30 == (-96269830));
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((-101), (-86));
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-15) + "'", int12 == (-15));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.divide((int) 'a', (-207));
        int int21 = calculator0.multiply(0, (-867133440));
        int int24 = calculator0.divide((-1923), (-520185));
        int int27 = calculator0.add((-1357816827), (-190));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1357817017) + "'", int27 == (-1357817017));
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.add((-3528), (-7567));
        int int24 = calculator0.divide((-346346486), (int) (short) 100);
        int int27 = calculator0.add(1520179488, 236472665);
        int int30 = calculator0.multiply((-6858340), 49164297);
        int int33 = calculator0.subtract((-15200), (-1448314236));
        int int36 = calculator0.divide((-869367270), 65689586);
        int int39 = calculator0.subtract(1257672544, 452546306);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11095) + "'", int21 == (-11095));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3463464) + "'", int24 == (-3463464));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1756652153 + "'", int27 == 1756652153);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-467179908) + "'", int30 == (-467179908));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1448299036 + "'", int33 == 1448299036);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-13) + "'", int36 == (-13));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 805126238 + "'", int39 == 805126238);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide((-867133571), (-7600));
        int int21 = calculator0.subtract((-8085940), 757717952);
        int int24 = calculator0.multiply(1395, 0);
        int int27 = calculator0.subtract(86713344, 568480);
        int int30 = calculator0.add((-365802382), (-1617647721));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 114096 + "'", int18 == 114096);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-765803892) + "'", int21 == (-765803892));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 86144864 + "'", int27 == 86144864);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1983450103) + "'", int30 == (-1983450103));
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((-7466), 67686400);
        int int18 = calculator0.divide(0, 6992);
        int int21 = calculator0.multiply((-173436074), (int) (short) 0);
        int int24 = calculator0.divide((-52), 1219996744);
        int int27 = calculator0.add(1145169864, 823407538);
        int int30 = calculator0.multiply(736984748, 1383615488);
        int int33 = calculator0.divide((-545574417), (-86713342));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1968577402 + "'", int27 == 1968577402);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-96792576) + "'", int30 == (-96792576));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((-101), (-86));
        int int15 = calculator0.add((-362406912), (-173426797));
        int int18 = calculator0.subtract(2129948464, 1730079900);
        int int21 = calculator0.add((-18090313), (-917629359));
        int int24 = calculator0.add(1409005073, 284903989);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-15) + "'", int12 == (-15));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-535833709) + "'", int15 == (-535833709));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 399868564 + "'", int18 == 399868564);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-935719672) + "'", int21 == (-935719672));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1693909062 + "'", int24 == 1693909062);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.subtract(0, 1322291616);
        int int18 = calculator0.add((-665227), 2085965638);
        int int21 = calculator0.divide((-1730079900), (-3459));
        int int24 = calculator0.multiply(1133543421, 2075617054);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1322291616) + "'", int15 == (-1322291616));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2085300411 + "'", int18 == 2085300411);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 500167 + "'", int21 == 500167);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 457755302 + "'", int24 == 457755302);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide(692692992, 2);
        int int21 = calculator0.divide(1237148864, (-1));
        int int24 = calculator0.divide(501219328, 754840506);
        int int27 = calculator0.add(0, (-867138628));
        int int30 = calculator0.add(1271882624, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 346346496 + "'", int18 == 346346496);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1237148864) + "'", int21 == (-1237148864));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-867138628) + "'", int27 == (-867138628));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1271882624 + "'", int30 == 1271882624);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.subtract(1271882624, 3400);
        int int24 = calculator0.add(287137963, 1);
        int int27 = calculator0.multiply((-49173772), (-171620238));
        int int30 = calculator0.divide(502657300, (-425848194));
        int int33 = calculator0.multiply(1724409546, (-1964297059));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 287137964 + "'", int24 == 287137964);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1145651032) + "'", int27 == (-1145651032));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-46788126) + "'", int33 == (-46788126));
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.multiply((-68), (int) (short) 1);
        int int18 = calculator0.divide(20, (-109415445));
        int int21 = calculator0.add((-1772159544), 0);
        int int24 = calculator0.multiply((-223539911), (-440742595));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-68) + "'", int15 == (-68));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1772159544) + "'", int21 == (-1772159544));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-12792939) + "'", int24 == (-12792939));
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.divide((-277225008), 1353728);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-204) + "'", int21 == (-204));
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.subtract(0, 1322291616);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1322291616) + "'", int15 == (-1322291616));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(859177974, 867133667);
        int int15 = calculator0.multiply((-49173772), (-34));
        int int18 = calculator0.subtract(328704999, 417847584);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 296448802 + "'", int12 == 296448802);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1671908248 + "'", int15 == 1671908248);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-89142585) + "'", int18 == (-89142585));
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.add(867133491, (int) (byte) 100);
        int int27 = calculator0.divide(1730079900, (-3));
        int int30 = calculator0.divide(0, (-23207515));
        int int33 = calculator0.subtract((-2243610), (-11868326));
        int int36 = calculator0.multiply(1432972439, (-1897778925));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 867133591 + "'", int24 == 867133591);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-576693300) + "'", int27 == (-576693300));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9624716 + "'", int33 == 9624716);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 602535477 + "'", int36 == 602535477);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((int) '#', (int) (short) -1);
        int int21 = calculator0.subtract((int) (short) 0, (-1769916224));
        int int24 = calculator0.multiply((-2146806852), 665);
        int int27 = calculator0.multiply(843, (-787654861));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1769916224 + "'", int21 == 1769916224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1697414308) + "'", int24 == (-1697414308));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1726883057 + "'", int27 == 1726883057);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((int) (short) 0, 110);
        int int21 = calculator0.subtract((-207), (-88947591));
        int int24 = calculator0.divide((-290738176), 870696771);
        int int27 = calculator0.multiply(211766202, (-1459544222));
        int int30 = calculator0.subtract((-568590), 0);
        int int33 = calculator0.divide(1559022262, 1812093894);
        java.lang.Class<?> wildcardClass34 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 88947384 + "'", int21 == 88947384);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 887128884 + "'", int27 == 887128884);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-568590) + "'", int30 == (-568590));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.divide((-1010), 1152037484);
        int int24 = calculator0.subtract((-1746895405), (-1876799379));
        int int27 = calculator0.subtract((-23207537), 42260032);
        int int30 = calculator0.multiply(86698157, (-2115365052));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 129903974 + "'", int24 == 129903974);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-65467569) + "'", int27 == (-65467569));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 359618804 + "'", int30 == 359618804);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', 1);
        int int15 = calculator0.multiply((-111), (-1919));
        int int18 = calculator0.subtract((-2), (-1262618369));
        int int21 = calculator0.multiply((-581169146), 105343664);
        int int24 = calculator0.subtract(173435032, 367637962);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 213009 + "'", int15 == 213009);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1262618367 + "'", int18 == 1262618367);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-476610528) + "'", int21 == (-476610528));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-194202930) + "'", int24 == (-194202930));
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) ' ', (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.subtract((-36), (-31));
        int int18 = calculator0.subtract((int) (byte) 0, 1494342816);
        int int21 = calculator0.subtract(0, (-1510103384));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1494342816) + "'", int18 == (-1494342816));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1510103384 + "'", int21 == 1510103384);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.multiply(2118708574, (-1285850013));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1133990746 + "'", int21 == 1133990746);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add(1, (-867133440));
        int int18 = calculator0.divide((-159), (-173436042));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133439) + "'", int15 == (-867133439));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.subtract(1271882624, 3400);
        int int24 = calculator0.divide(780440677, 867133667);
        int int27 = calculator0.subtract(0, (-1481140680));
        int int30 = calculator0.add((-1820924396), (-121));
        int int33 = calculator0.multiply(1736178548, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1481140680 + "'", int27 == 1481140680);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1820924517) + "'", int30 == (-1820924517));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.add(520297, (-867133611));
        int int18 = calculator0.subtract((-1923), (-109415650));
        int int21 = calculator0.add((-206361130), (-86713457));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-866613314) + "'", int15 == (-866613314));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109413727 + "'", int18 == 109413727);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-293074587) + "'", int21 == (-293074587));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.subtract((-36), (-31));
        int int18 = calculator0.subtract((int) (byte) 0, 1494342816);
        int int21 = calculator0.divide(1152037536, 37489359);
        int int24 = calculator0.add(910738184, (-1399144532));
        int int27 = calculator0.multiply((-1058206662), 37489359);
        int int30 = calculator0.multiply((-1333062898), (-601961808));
        int int33 = calculator0.add((-3), (-2040839151));
        int int36 = calculator0.divide((-570227110), 1481140680);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1494342816) + "'", int18 == (-1494342816));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-488406348) + "'", int24 == (-488406348));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1816189210) + "'", int27 == (-1816189210));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1615472032 + "'", int30 == 1615472032);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2040839154) + "'", int33 == (-2040839154));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.subtract((-86713342), 86713455);
        int int21 = calculator0.subtract(1, (-152));
        int int24 = calculator0.multiply((-3), 867133501);
        int int27 = calculator0.multiply((-258), (-8));
        int int30 = calculator0.multiply((-6858340), 326167110);
        int int33 = calculator0.divide((-1848235514), 2133564696);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 153 + "'", int21 == 153);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1693566793 + "'", int24 == 1693566793);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2064 + "'", int27 == 2064);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 59447464 + "'", int30 == 59447464);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.multiply((-88956701), 568480);
        int int21 = calculator0.subtract(86, 114096);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1160441376) + "'", int18 == (-1160441376));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-114010) + "'", int21 == (-114010));
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        int int21 = calculator0.subtract((int) (byte) 1, 32);
        int int24 = calculator0.add(520297, 1810185236);
        int int27 = calculator0.divide((-1475970418), 1391530220);
        int int30 = calculator0.add((-415203), 151369422);
        int int33 = calculator0.divide((-109415563), 866523750);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1810705533 + "'", int24 == 1810705533);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 150954219 + "'", int30 == 150954219);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((-97), 96);
        int int15 = calculator0.divide((-15300), 1693566793);
        int int18 = calculator0.subtract(1527277189, (-1802498291));
        int int21 = calculator0.multiply((-289198612), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9312) + "'", int12 == (-9312));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-965191816) + "'", int18 == (-965191816));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide(100, 98);
        int int21 = calculator0.multiply(3563280, 867133546);
        int int24 = calculator0.subtract(1524237619, 1322286215);
        int int27 = calculator0.add((-147803916), 97);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1494342816 + "'", int21 == 1494342816);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 201951404 + "'", int24 == 201951404);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-147803819) + "'", int27 == (-147803819));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        int int21 = calculator0.subtract((int) (byte) 1, 32);
        int int24 = calculator0.divide((-86713457), (-2020));
        int int27 = calculator0.divide((int) (byte) 0, 42260032);
        int int30 = calculator0.add(1134921440, 2119919730);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42927 + "'", int24 == 42927);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1040126126) + "'", int30 == (-1040126126));
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((-152), (-867154019));
        int int24 = calculator0.subtract(0, (-4864));
        int int27 = calculator0.subtract(1353728, 4208290);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1336575288) + "'", int21 == (-1336575288));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4864 + "'", int24 == 4864);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2854562) + "'", int27 == (-2854562));
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.add((-109415539), (-111));
        int int24 = calculator0.add((-757113551), (-1807123776));
        int int27 = calculator0.subtract(8, (-1));
        int int30 = calculator0.multiply((-3528), (-934840515));
        int int33 = calculator0.multiply(76, 823407538);
        int int36 = calculator0.add((-56), 1307876210);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-109415650) + "'", int21 == (-109415650));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1730729969 + "'", int24 == 1730729969);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-417546408) + "'", int30 == (-417546408));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1845536552) + "'", int33 == (-1845536552));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1307876154 + "'", int36 == 1307876154);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.subtract(1271882624, 3400);
        int int24 = calculator0.add(287137963, 1);
        int int27 = calculator0.subtract((-23207515), (-1556003565));
        int int30 = calculator0.divide(1771863899, 867148791);
        int int33 = calculator0.divide(1733781467, (-397900692));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 287137964 + "'", int24 == 287137964);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1532796050 + "'", int27 == 1532796050);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-4) + "'", int33 == (-4));
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply(0, 0);
        int int18 = calculator0.multiply(867133667, (-97));
        int int21 = calculator0.subtract((-173426797), 9277);
        int int24 = calculator0.subtract((-112879003), 1810186246);
        int int27 = calculator0.subtract((-867133342), (-1834803396));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1787380221 + "'", int18 == 1787380221);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173436074) + "'", int21 == (-173436074));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1923065249) + "'", int24 == (-1923065249));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 967670054 + "'", int27 == 967670054);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.multiply((-68), (int) (short) 1);
        int int18 = calculator0.divide(20, (-109415445));
        int int21 = calculator0.add(210, (-96348159));
        int int24 = calculator0.subtract(902771538, (-1185779371));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-68) + "'", int15 == (-68));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-96347949) + "'", int21 == (-96347949));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2088550909 + "'", int24 == 2088550909);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.divide((-1010), 1152037484);
        int int24 = calculator0.subtract((-2146806852), 1610593080);
        int int27 = calculator0.divide((-1497046880), (-412970881));
        int int30 = calculator0.add((-1059177584), 36927547);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 537567364 + "'", int24 == 537567364);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1022250037) + "'", int30 == (-1022250037));
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract(20580, (-867133439));
        int int21 = calculator0.divide((-609787), (-31));
        int int24 = calculator0.multiply((-50514530), (-867133666));
        int int27 = calculator0.divide((-3698467), 718097088);
        int int30 = calculator0.divide((-170954984), (-1820924517));
        int int33 = calculator0.add((-1183140366), 1020465408);
        int int36 = calculator0.subtract(1122529476, (-2104668974));
        int int39 = calculator0.subtract((-664541957), 127295488);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19670 + "'", int21 == 19670);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1448314236) + "'", int24 == (-1448314236));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-162674958) + "'", int33 == (-162674958));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1067768846) + "'", int36 == (-1067768846));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-791837445) + "'", int39 == (-791837445));
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide((int) (short) 10, (-173426914));
        int int21 = calculator0.multiply((-46566313), (-1951649816));
        int int24 = calculator0.subtract((-887064863), (-685328092));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1877043160 + "'", int21 == 1877043160);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-201736771) + "'", int24 == (-201736771));
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        int int15 = calculator0.divide(9, 867133591);
        int int18 = calculator0.subtract(9, (-109415563));
        int int21 = calculator0.add((-1769916127), 859177974);
        int int24 = calculator0.multiply(1890678640, (-1385028472));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109415572 + "'", int18 == 109415572);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-910738153) + "'", int21 == (-910738153));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1292684416) + "'", int24 == (-1292684416));
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.add(867133667, (-121));
        int int21 = calculator0.subtract(0, (-1908264058));
        int int24 = calculator0.multiply((-685834), (-78));
        int int27 = calculator0.multiply(502657300, (-380871040));
        int int30 = calculator0.divide((-59149533), (-675399327));
        int int33 = calculator0.add(2147277163, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133546 + "'", int18 == 867133546);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1908264058 + "'", int21 == 1908264058);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53495052 + "'", int24 == 53495052);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 258859520 + "'", int27 == 258859520);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147277163 + "'", int33 == 2147277163);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.multiply((int) (short) -1, 49164339);
        int int12 = calculator0.add(86698157, 21975739);
        int int15 = calculator0.add((-346346486), (-1555994242));
        int int18 = calculator0.multiply(1323847021, (-579176885));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-49164339) + "'", int9 == (-49164339));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 108673896 + "'", int12 == 108673896);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1902340728) + "'", int15 == (-1902340728));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 816901359 + "'", int18 == 816901359);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((-290), (-1887134100));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1887133810 + "'", int18 == 1887133810);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (byte) 1, 96);
        int int24 = calculator0.subtract((-867125924), (int) (byte) 0);
        int int27 = calculator0.divide(9277, 11);
        int int30 = calculator0.subtract((-442694645), 568480);
        int int33 = calculator0.subtract(1237148863, 98);
        int int36 = calculator0.add((-380871040), (-2146806784));
        int int39 = calculator0.subtract((-425848194), (-320579822));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867125924) + "'", int24 == (-867125924));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 843 + "'", int27 == 843);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-443263125) + "'", int30 == (-443263125));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1237148765 + "'", int33 == 1237148765);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1767289472 + "'", int36 == 1767289472);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-105268372) + "'", int39 == (-105268372));
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.multiply(1474273060, (-867133566));
        int int15 = calculator0.divide(1494342816, (-4864));
        int int18 = calculator0.multiply(1202467776, 859177974);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-240317368) + "'", int12 == (-240317368));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-307225) + "'", int15 == (-307225));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 244644480 + "'", int18 == 244644480);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((-97), 96);
        int int15 = calculator0.divide((-15300), 1693566793);
        int int18 = calculator0.subtract(37489359, (-1237148864));
        int int21 = calculator0.add((-1441521995), 426708041);
        int int24 = calculator0.divide((-1838369148), (-1740666144));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9312) + "'", int12 == (-9312));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1274638223 + "'", int18 == 1274638223);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1014813954) + "'", int21 == (-1014813954));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.add((-867133515), 1154271478);
        int int18 = calculator0.divide(452435152, 867148791);
        int int21 = calculator0.multiply((-382875265), (-9433));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 287137963 + "'", int15 == 287137963);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-405121191) + "'", int21 == (-405121191));
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.add((int) 'a', (-2020));
        int int15 = calculator0.divide((-1486954551), 1002376880);
        int int18 = calculator0.divide((-1788169344), 1868868637);
        int int21 = calculator0.divide(1001242336, (-969710426));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1923) + "'", int12 == (-1923));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.subtract((-100), 2243220);
        int int21 = calculator0.subtract((-86713342), 0);
        int int24 = calculator0.multiply((-1734245508), (-1469333649));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2243320) + "'", int18 == (-2243320));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86713342) + "'", int21 == (-86713342));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 66422468 + "'", int24 == 66422468);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.divide(2233940, (-86713551));
        int int15 = calculator0.subtract((-583407129), 733153631);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1316560760) + "'", int15 == (-1316560760));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.subtract(1271882624, 3400);
        int int24 = calculator0.divide(4864, 358019360);
        int int27 = calculator0.add(363737902, (-26274295));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 337463607 + "'", int27 == 337463607);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.subtract((-86), (-109415563));
        int int15 = calculator0.add(0, 757944224);
        int int18 = calculator0.add(2, 1152037536);
        int int21 = calculator0.add(548010, (-1985610752));
        int int24 = calculator0.multiply(2139980843, 95596657);
        int int27 = calculator0.add(213009, (-411561728));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109415477 + "'", int12 == 109415477);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 757944224 + "'", int15 == 757944224);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1152037538 + "'", int18 == 1152037538);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1985062742) + "'", int21 == (-1985062742));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1429923579 + "'", int24 == 1429923579);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-411348719) + "'", int27 == (-411348719));
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.subtract(1271882624, 3400);
        int int24 = calculator0.add(287137963, 1);
        int int27 = calculator0.multiply((-49173772), (-171620238));
        int int30 = calculator0.add((-867133342), (-2060147631));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 287137964 + "'", int24 == 287137964);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1145651032) + "'", int27 == (-1145651032));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1367686323 + "'", int30 == 1367686323);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (byte) 1, 96);
        int int24 = calculator0.subtract(25, 867133591);
        int int27 = calculator0.multiply((-173426797), (-110));
        int int30 = calculator0.multiply(52, 1145651162);
        int int33 = calculator0.divide((-488406348), (-307225));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867133566) + "'", int24 == (-867133566));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1897078486 + "'", int27 == 1897078486);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-555681720) + "'", int30 == (-555681720));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1589 + "'", int33 == 1589);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.multiply((-101), (int) (short) 10);
        int int18 = calculator0.multiply(86713344, 1700666764);
        int int21 = calculator0.multiply((-433567285), 1908264022);
        int int24 = calculator0.multiply((-757113354), (-173436074));
        int int27 = calculator0.add((-865948009), (-403723706));
        int int30 = calculator0.divide((-164656960), 520484954);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1010) + "'", int15 == (-1010));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-290738176) + "'", int18 == (-290738176));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2110419406) + "'", int21 == (-2110419406));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1889283420) + "'", int24 == (-1889283420));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1269671715) + "'", int27 == (-1269671715));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.add((-3528), (-7567));
        int int24 = calculator0.divide((-346346486), (int) (short) 100);
        int int27 = calculator0.subtract(807706469, (-7325507));
        // The following exception was thrown during execution in test generation
        try {
            int int30 = calculator0.divide(1423849605, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11095) + "'", int21 == (-11095));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3463464) + "'", int24 == (-3463464));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 815031976 + "'", int27 == 815031976);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract(76, (-867133439));
        int int18 = calculator0.subtract((-15200), (int) (short) 100);
        int int21 = calculator0.subtract(1648038772, (-1865879362));
        int int24 = calculator0.divide(181871953, 1398237147);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-15300) + "'", int18 == (-15300));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-781049162) + "'", int21 == (-781049162));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.add(51, (int) (short) 1);
        int int15 = calculator0.add(1700666764, 96);
        int int18 = calculator0.subtract((-1923), (-2003427328));
        int int21 = calculator0.divide(1408199649, 86144901);
        int int24 = calculator0.divide((-369993770), 27);
        int int27 = calculator0.multiply(967670054, 1237148811);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666860 + "'", int15 == 1700666860);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2003425405 + "'", int18 == 2003425405);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-13703472) + "'", int24 == (-13703472));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1536270242 + "'", int27 == 1536270242);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.divide((-1010), 86713455);
        int int24 = calculator0.multiply(1779063741, 1671243464);
        int int27 = calculator0.subtract(1477466179, 1495828402);
        int int30 = calculator0.add(1013248472, (-28544742));
        int int33 = calculator0.multiply((-7325507), 2060248172);
        int int36 = calculator0.divide((-867118337), 37474034);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1147225688) + "'", int24 == (-1147225688));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-18362223) + "'", int27 == (-18362223));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 984703730 + "'", int30 == 984703730);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1946401860) + "'", int33 == (-1946401860));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-23) + "'", int36 == (-23));
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.multiply((-46), (-152));
        int int27 = calculator0.multiply(867133491, 202);
        int int30 = calculator0.divide(1787380221, (-86713551));
        int int33 = calculator0.divide((-845157802), 32);
        int int36 = calculator0.add((-1494342816), (-1262618369));
        int int39 = calculator0.multiply((-597524597), (-164656960));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6992 + "'", int24 == 6992);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-932693954) + "'", int27 == (-932693954));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-20) + "'", int30 == (-20));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-26411181) + "'", int33 == (-26411181));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1538006111 + "'", int36 == 1538006111);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1708752832) + "'", int39 == (-1708752832));
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract(1787380221, 86713457);
        int int18 = calculator0.multiply(8671336, (-1481140680));
        int int21 = calculator0.multiply(178159040, (int) (byte) 0);
        int int24 = calculator0.subtract((-13314), 693717859);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-161052992) + "'", int18 == (-161052992));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-693731173) + "'", int24 == (-693731173));
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(1145179144, 100);
        int int15 = calculator0.multiply((-2146806784), 287137963);
        int int18 = calculator0.subtract(815031976, 734011);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1145179044 + "'", int12 == 1145179044);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-362406912) + "'", int15 == (-362406912));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 814297965 + "'", int18 == 814297965);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((-68), (int) (byte) 10);
        int int21 = calculator0.divide(96, (-68));
        int int24 = calculator0.divide((-15300), (-520200));
        int int27 = calculator0.add((-171620289), 665305);
        int int30 = calculator0.subtract(8939518, (-609787));
        int int33 = calculator0.divide((-1140394960), 282034071);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-170954984) + "'", int27 == (-170954984));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9549305 + "'", int30 == 9549305);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-4) + "'", int33 == (-4));
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract((-867154019), 67686496);
        int int18 = calculator0.add((-214452976), (-1838369148));
        int int21 = calculator0.add(568590, 0);
        int int24 = calculator0.divide((-88947591), (-2033296844));
        int int27 = calculator0.subtract((-14887285), (-1341547376));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-934840515) + "'", int15 == (-934840515));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2052822124) + "'", int18 == (-2052822124));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 568590 + "'", int21 == 568590);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1326660091 + "'", int27 == 1326660091);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply((-76), (int) (short) -1);
        int int18 = calculator0.add((-10), (-68));
        int int21 = calculator0.add((-346346486), (-96348159));
        int int24 = calculator0.add((-1769916224), 867133591);
        int int27 = calculator0.multiply((-6867620), (-1700666664));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 76 + "'", int15 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-78) + "'", int18 == (-78));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-442694645) + "'", int21 == (-442694645));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-902782633) + "'", int24 == (-902782633));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 193740192 + "'", int27 == 193740192);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract((-1700666664), (-241122442));
        int int18 = calculator0.subtract(352535033, 279542796);
        int int21 = calculator0.add((-769474828), 1675555702);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1459544222) + "'", int15 == (-1459544222));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 72992237 + "'", int18 == 72992237);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 906080874 + "'", int21 == 906080874);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.add(32, (-9312));
        int int12 = calculator0.add((-1786823011), 243347733);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9280) + "'", int9 == (-9280));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1543475278) + "'", int12 == (-1543475278));
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.divide((-173436074), 96);
        int int24 = calculator0.divide(67686400, 11);
        int int27 = calculator0.add((-467179908), (-2033296844));
        // The following exception was thrown during execution in test generation
        try {
            int int30 = calculator0.divide(827360554, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1806625) + "'", int21 == (-1806625));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6153309 + "'", int24 == 6153309);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1794490544 + "'", int27 == 1794490544);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.subtract(0, 1322291616);
        int int18 = calculator0.add((-665227), 2085965638);
        int int21 = calculator0.add((-7567), 859177974);
        int int24 = calculator0.multiply(815415403, (-867138628));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1322291616) + "'", int15 == (-1322291616));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2085300411 + "'", int18 == 2085300411);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 859170407 + "'", int21 == 859170407);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 95293332 + "'", int24 == 95293332);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract(1237147755, 1017804111);
        int int15 = calculator0.divide((-1298016164), (-1318605841));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 219343644 + "'", int12 == 219343644);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract(0, 8);
        int int21 = calculator0.subtract(675399327, (-916384));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 676315711 + "'", int21 == 676315711);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.subtract((-867133440), 692692992);
        int int21 = calculator0.add(1477466179, (-1803015996));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1559826432) + "'", int18 == (-1559826432));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-325549817) + "'", int21 == (-325549817));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) ' ', 109415477);
        int int15 = calculator0.subtract(1429923579, 1908264017);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-109415445) + "'", int12 == (-109415445));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-478340438) + "'", int15 == (-478340438));
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.multiply(2, (-86713457));
        int int24 = calculator0.subtract(9552800, 96);
        int int27 = calculator0.add((-109415539), (-3463464));
        int int30 = calculator0.multiply((-1876799379), (-425855760));
        int int33 = calculator0.multiply(172635648, 1736081800);
        java.lang.Class<?> wildcardClass34 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173426914) + "'", int21 == (-173426914));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9552704 + "'", int24 == 9552704);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-112879003) + "'", int27 == (-112879003));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 363612720 + "'", int30 == 363612720);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1734168576) + "'", int33 == (-1734168576));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract(1787380221, 86713457);
        int int18 = calculator0.add((-68), (-2146806784));
        int int21 = calculator0.divide((-1813700023), (-50514530));
        int int24 = calculator0.multiply((-1422605012), 1810185237);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2146806852) + "'", int18 == (-2146806852));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 770079900 + "'", int24 == 770079900);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.divide(51, 109);
        int int18 = calculator0.multiply(1152037538, 21975629);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 378379962 + "'", int18 == 378379962);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-68), 110);
        int int18 = calculator0.subtract(86713457, 76);
        int int21 = calculator0.add((-307225), (-7955541));
        int int24 = calculator0.multiply(1968577402, (-1665941363));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86713381 + "'", int18 == 86713381);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8262766) + "'", int21 == (-8262766));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1017732558) + "'", int24 == (-1017732558));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.divide((-1248231612), 1754528548);
        int int21 = calculator0.add(6153309, 1001242336);
        int int24 = calculator0.divide((-609789), 1144658859);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1007395645 + "'", int21 == 1007395645);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.divide(867133667, (int) (byte) 100);
        int int24 = calculator0.add((-171620289), 5983);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8671336 + "'", int21 == 8671336);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-171614306) + "'", int24 == (-171614306));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.subtract((int) (byte) -1, 0);
        int int21 = calculator0.add(0, (-520200));
        int int24 = calculator0.subtract((-443263125), 25);
        int int27 = calculator0.subtract((-3528), (-49173772));
        int int30 = calculator0.subtract((-675399327), 1759764986);
        int int33 = calculator0.add(273140353, (-778620712));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-520200) + "'", int21 == (-520200));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-443263150) + "'", int24 == (-443263150));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 49170244 + "'", int27 == 49170244);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1859802983 + "'", int30 == 1859802983);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-505480359) + "'", int33 == (-505480359));
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((int) '#', (int) ' ');
        int int18 = calculator0.add(34, (-1010));
        int int21 = calculator0.multiply(568480, (-6));
        int int24 = calculator0.multiply((-170954984), (-601961808));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-976) + "'", int18 == (-976));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3410880) + "'", int21 == (-3410880));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1360351360 + "'", int24 == 1360351360);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.subtract((-1), (-97));
        int int21 = calculator0.add((-97), 98);
        int int24 = calculator0.divide(178159040, (-867158093));
        int int27 = calculator0.divide((-152), (-45247));
        int int30 = calculator0.add((-462757624), 109413727);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-353343897) + "'", int30 == (-353343897));
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(76, 692692992);
        int int21 = calculator0.subtract(51, (-665254));
        int int24 = calculator0.add(520201, 0);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 665305 + "'", int21 == 665305);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 520201 + "'", int24 == 520201);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (byte) 100, (-1));
        int int12 = calculator0.add((-665254), (-1357151573));
        int int15 = calculator0.divide(0, 1769916224);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = calculator0.divide(202130994, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1357816827) + "'", int12 == (-1357816827));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((int) (short) 0, 110);
        int int21 = calculator0.multiply((-867133491), (-9280));
        int int24 = calculator0.multiply((-1769916224), (-173426797));
        int int27 = calculator0.divide(916297957, (-901948644));
        int int30 = calculator0.add(2075617088, (-341784793));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42260032 + "'", int24 == 42260032);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1733832295 + "'", int30 == 1733832295);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.subtract(0, (-110));
        int int24 = calculator0.divide(213009, (-241122442));
        int int27 = calculator0.divide((-568590), 1495828402);
        int int30 = calculator0.subtract(0, 1237148811);
        int int33 = calculator0.multiply((-433567285), 15005);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 110 + "'", int21 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1237148811) + "'", int30 == (-1237148811));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1198342015 + "'", int33 == 1198342015);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add(101, (-2020));
        int int12 = calculator0.add(0, 1693566793);
        int int15 = calculator0.add((-214132468), 1322291616);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1919) + "'", int9 == (-1919));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1693566793 + "'", int12 == 1693566793);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1108159148 + "'", int15 == 1108159148);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide(100, (-867133440));
        int int21 = calculator0.subtract(1154271478, 349159852);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 805111626 + "'", int21 == 805111626);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (byte) 100, (-1));
        int int12 = calculator0.subtract(1152037484, 153);
        int int15 = calculator0.multiply(95, 35);
        int int18 = calculator0.add((-1175891336), 1014145947);
        int int21 = calculator0.add(1908264017, 610322400);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1152037331 + "'", int12 == 1152037331);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3325 + "'", int15 == 3325);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-161745389) + "'", int18 == (-161745389));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1776380879) + "'", int21 == (-1776380879));
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        int int21 = calculator0.divide(101, (-101));
        int int24 = calculator0.add(1810185236, (int) (byte) 1);
        int int27 = calculator0.subtract(42260132, 944516863);
        int int30 = calculator0.subtract((-477996044), 827319272);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1810185237 + "'", int24 == 1810185237);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-902256731) + "'", int27 == (-902256731));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1305315316) + "'", int30 == (-1305315316));
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.multiply(2, (-86713457));
        int int24 = calculator0.divide((-1919), 109415572);
        int int27 = calculator0.divide(0, 13276316);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173426914) + "'", int21 == (-173426914));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply((-76), (-7480));
        int int9 = calculator0.subtract((-86713457), 2243220);
        int int12 = calculator0.divide((-7480), 1944410221);
        int int15 = calculator0.subtract((-1687920631), (-1123990489));
        int int18 = calculator0.multiply((-866613314), 178159040);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 568480 + "'", int6 == 568480);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-88956677) + "'", int9 == (-88956677));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-563930142) + "'", int15 == (-563930142));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1343122304) + "'", int18 == (-1343122304));
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.subtract((-111), (-111));
        int int24 = calculator0.multiply((-869367270), 1237148864);
        int int27 = calculator0.add((-433567285), (-636451253));
        int int30 = calculator0.subtract(1558344461, (-1908264058));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-991577216) + "'", int24 == (-991577216));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1070018538) + "'", int27 == (-1070018538));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-828358777) + "'", int30 == (-828358777));
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.subtract((-36), (-31));
        int int18 = calculator0.subtract((int) (byte) 0, 1494342816);
        int int21 = calculator0.add((-1145651066), 1170137828);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1494342816) + "'", int18 == (-1494342816));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 24486762 + "'", int21 == 24486762);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.add(867133667, (-121));
        int int21 = calculator0.subtract(0, (-1908264058));
        int int24 = calculator0.multiply((-685834), (-78));
        int int27 = calculator0.multiply(502657300, (-380871040));
        int int30 = calculator0.divide((-59149533), (-675399327));
        int int33 = calculator0.subtract((-8262766), (-1452481693));
        int int36 = calculator0.divide(757717952, 1257480666);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133546 + "'", int18 == 867133546);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1908264058 + "'", int21 == 1908264058);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53495052 + "'", int24 == 53495052);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 258859520 + "'", int27 == 258859520);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1444218927 + "'", int33 == 1444218927);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract(9, (-100));
        int int15 = calculator0.divide(76, 692692992);
        int int18 = calculator0.add((int) 'a', (-867133439));
        int int21 = calculator0.add((-9312), (-1555994242));
        int int24 = calculator0.subtract(440742595, (-1985062742));
        int int27 = calculator0.multiply((-307225), (-170954984));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109 + "'", int12 == 109);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-867133342) + "'", int18 == (-867133342));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1556003554) + "'", int21 == (-1556003554));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1869161959) + "'", int24 == (-1869161959));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1510103384) + "'", int27 == (-1510103384));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply((-7567), (int) 'a');
        int int9 = calculator0.subtract(867154019, 76);
        int int12 = calculator0.multiply(956079995, (-1126964223));
        int int15 = calculator0.multiply((-28544742), (-23318356));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-733999) + "'", int6 == (-733999));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 867153943 + "'", int9 == 867153943);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-43570309) + "'", int12 == (-43570309));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-395780744) + "'", int15 == (-395780744));
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.multiply((-111), (-3528));
        int int15 = calculator0.add((-36), 1908264058);
        int int18 = calculator0.divide(1897078486, 86605184);
        int int21 = calculator0.subtract(902771538, 1145179144);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 391608 + "'", int12 == 391608);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1908264022 + "'", int15 == 1908264022);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 21 + "'", int18 == 21);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-242407606) + "'", int21 == (-242407606));
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide((-867133571), (-7600));
        int int21 = calculator0.subtract((-8085940), 757717952);
        int int24 = calculator0.multiply(1395, 0);
        int int27 = calculator0.multiply(1271879224, (-272902));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 114096 + "'", int18 == 114096);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-765803892) + "'", int21 == (-765803892));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-601961808) + "'", int27 == (-601961808));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.divide(86713381, (-3528));
        int int12 = calculator0.multiply(1923, (-1469333649));
        int int15 = calculator0.multiply((-1636781857), 736984748);
        int int18 = calculator0.divide((-88956701), (-1740666144));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-24578) + "'", int9 == (-24578));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 559873741 + "'", int12 == 559873741);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 506959828 + "'", int15 == 506959828);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((int) (short) 0, 34);
        int int15 = calculator0.add((-1411353752), (-867743227));
        int int18 = calculator0.multiply((-197121368), (-1176431440));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2015870317 + "'", int15 == 2015870317);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-719686784) + "'", int18 == (-719686784));
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(67686400, (-111));
        int int21 = calculator0.multiply(867133381, 867133420);
        int int24 = calculator0.divide(1730729969, 1610593080);
        int int27 = calculator0.multiply(42260032, 867133381);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-609787) + "'", int18 == (-609787));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1730079900 + "'", int21 == 1730079900);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1741906112) + "'", int27 == (-1741906112));
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide((int) (short) 10, (-173426914));
        int int21 = calculator0.multiply(1076983947, 1238032199);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1503165555) + "'", int21 == (-1503165555));
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.add(1497091025, 527778844);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2024869869 + "'", int18 == 2024869869);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((int) (short) 0, 110);
        int int21 = calculator0.multiply((-867133491), (-9280));
        int int24 = calculator0.multiply((int) (short) -1, (-1923));
        int int27 = calculator0.multiply(1610593080, (-609787));
        int int30 = calculator0.subtract(2064, 210);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1923 + "'", int24 == 1923);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1435799528) + "'", int27 == (-1435799528));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1854 + "'", int30 == 1854);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((-3), 86713344);
        int int15 = calculator0.divide((-15300), 867133511);
        int int18 = calculator0.add(1152016958, 867142838);
        int int21 = calculator0.divide(0, 570610471);
        int int24 = calculator0.divide((-609789), 1002899992);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2019159796 + "'", int18 == 2019159796);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.multiply((-111), (-3528));
        int int15 = calculator0.add((-36), 1908264058);
        int int18 = calculator0.subtract(22, 26278408);
        int int21 = calculator0.multiply(1519745012, 1145169847);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 391608 + "'", int12 == 391608);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1908264022 + "'", int15 == 1908264022);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-26278386) + "'", int18 == (-26278386));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-452334740) + "'", int21 == (-452334740));
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.subtract((-1), 9);
        int int18 = calculator0.subtract((-2243320), 86713381);
        int int21 = calculator0.subtract((-97), 278045632);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-88956701) + "'", int18 == (-88956701));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-278045729) + "'", int21 == (-278045729));
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.multiply((-1923), 2115365205);
        int int12 = calculator0.divide(1269639246, (-433567285));
        int int15 = calculator0.divide((-134281536), 727845816);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-513259903) + "'", int9 == (-513259903));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide((-68), (int) (byte) 100);
        int int12 = calculator0.subtract((-111), (int) (short) 10);
        int int15 = calculator0.divide(745957086, 109);
        int int18 = calculator0.divide(1558344461, 66);
        int int21 = calculator0.add(114939, (-757113354));
        int int24 = calculator0.subtract(243347733, (-3600));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-121) + "'", int12 == (-121));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6843642 + "'", int15 == 6843642);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 23611279 + "'", int18 == 23611279);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-756998415) + "'", int21 == (-756998415));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 243351333 + "'", int24 == 243351333);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.subtract(100, (-1));
        int int21 = calculator0.divide(0, 1897078486);
        int int24 = calculator0.add(675399327, (-3600));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 675395727 + "'", int24 == 675395727);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.subtract(1271882624, 3400);
        int int24 = calculator0.divide(780440677, 867133667);
        int int27 = calculator0.subtract(0, (-1481140680));
        int int30 = calculator0.add((-1820924396), (-121));
        int int33 = calculator0.multiply((-757944310), 20580);
        int int36 = calculator0.divide((-867051763), 25);
        int int39 = calculator0.subtract(1955142987, 1007395645);
        java.lang.Class<?> wildcardClass40 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1481140680 + "'", int27 == 1481140680);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1820924517) + "'", int30 == (-1820924517));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 827319272 + "'", int33 == 827319272);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-34682070) + "'", int36 == (-34682070));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 947747342 + "'", int39 == 947747342);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.divide(51, 109);
        int int18 = calculator0.add(0, (-1919));
        int int21 = calculator0.divide(757717952, 9277);
        int int24 = calculator0.multiply(258, 780419964);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1919) + "'", int18 == (-1919));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 81677 + "'", int21 == 81677);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-515112200) + "'", int24 == (-515112200));
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((int) (short) 0, 34);
        int int15 = calculator0.multiply(290738210, (-1336575288));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1286025584) + "'", int15 == (-1286025584));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        int int21 = calculator0.divide(101, (-101));
        int int24 = calculator0.subtract((int) (short) 1, (int) (short) -1);
        int int27 = calculator0.divide(9, (-68));
        int int30 = calculator0.multiply((-52), 86713457);
        int int33 = calculator0.multiply(822099432, (-1357817017));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-214132468) + "'", int30 == (-214132468));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1635427160 + "'", int33 == 1635427160);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.multiply(2, (-86713457));
        int int24 = calculator0.divide((-1919), 109415572);
        int int27 = calculator0.add(1726946994, 86698157);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173426914) + "'", int21 == (-173426914));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1813645151 + "'", int27 == 1813645151);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.subtract((-100), 2243220);
        int int21 = calculator0.subtract((-86713342), 0);
        int int24 = calculator0.add((-86713651), (-755028714));
        int int27 = calculator0.subtract((-173436042), (-1110676512));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2243320) + "'", int18 == (-2243320));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86713342) + "'", int21 == (-86713342));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-841742365) + "'", int24 == (-841742365));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 937240470 + "'", int27 == 937240470);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((int) '#', (int) ' ');
        int int18 = calculator0.subtract(887061504, (-1263873927));
        int int21 = calculator0.multiply((-15), 707601614);
        int int24 = calculator0.add(1457090645, (-961364332));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2144031865) + "'", int18 == (-2144031865));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2024089618) + "'", int21 == (-2024089618));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 495726313 + "'", int24 == 495726313);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (byte) 1, 96);
        int int24 = calculator0.subtract((-867125924), (int) (byte) 0);
        int int27 = calculator0.divide(9277, 11);
        int int30 = calculator0.subtract((-442694645), 568480);
        int int33 = calculator0.subtract(1237148863, 98);
        int int36 = calculator0.add(1520179488, 866523750);
        int int39 = calculator0.multiply(67686496, 287137963);
        int int42 = calculator0.subtract(86144864, 628881376);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867125924) + "'", int24 == (-867125924));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 843 + "'", int27 == 843);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-443263125) + "'", int30 == (-443263125));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1237148765 + "'", int33 == 1237148765);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1908264058) + "'", int36 == (-1908264058));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-85512160) + "'", int39 == (-85512160));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-542736512) + "'", int42 == (-542736512));
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.multiply((int) (short) 10, (-685834));
        int int21 = calculator0.subtract(867154019, 1925360681);
        int int24 = calculator0.add((-3), 20);
        int int27 = calculator0.add((-2013281986), 1145186611);
        int int30 = calculator0.divide(1271869877, (-7325507));
        int int33 = calculator0.divide((-617839864), 1258058047);
        int int36 = calculator0.divide((-1951882450), 1577468396);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6858340) + "'", int18 == (-6858340));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1058206662) + "'", int21 == (-1058206662));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-868095375) + "'", int27 == (-868095375));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-173) + "'", int30 == (-173));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.divide((int) 'a', (-207));
        int int21 = calculator0.multiply((-2243610), (int) '#');
        int int24 = calculator0.add(693717859, (-74540096));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-78526350) + "'", int21 == (-78526350));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 619177763 + "'", int24 == 619177763);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(757717952, 867133515);
        int int15 = calculator0.divide((-1738066976), 866523750);
        int int18 = calculator0.multiply(754840506, (-135309308));
        int int21 = calculator0.add((-2033296844), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-109415563) + "'", int12 == (-109415563));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6668008 + "'", int18 == 6668008);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2033296844) + "'", int21 == (-2033296844));
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.divide((-1010), 86713455);
        int int24 = calculator0.multiply(1779063741, 1671243464);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1147225688) + "'", int24 == (-1147225688));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((-7466), 67686400);
        int int18 = calculator0.divide(0, 6992);
        int int21 = calculator0.multiply((-173436074), (int) (short) 0);
        int int24 = calculator0.divide((-52), 1219996744);
        int int27 = calculator0.add(1145169864, 823407538);
        int int30 = calculator0.multiply(736984748, 1383615488);
        int int33 = calculator0.add((-76), (-360839020));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1968577402 + "'", int27 == 1968577402);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-96792576) + "'", int30 == (-96792576));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-360839096) + "'", int33 == (-360839096));
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.subtract((int) (byte) -1, 0);
        int int21 = calculator0.multiply((-1152034604), (-934840515));
        int int24 = calculator0.divide(1020465408, (-20));
        int int27 = calculator0.subtract((-925594729), (-596556766));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1838369148) + "'", int21 == (-1838369148));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-51023270) + "'", int24 == (-51023270));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-329037963) + "'", int27 == (-329037963));
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract(1787380221, 86713457);
        int int18 = calculator0.add((-68), (-2146806784));
        int int21 = calculator0.divide((-1813700023), (-50514530));
        int int24 = calculator0.divide((-1145179180), 4864);
        int int27 = calculator0.subtract((-15300), (-37489334));
        int int30 = calculator0.multiply(1322286215, 827072948);
        int int33 = calculator0.divide(654086037, (-989528052));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2146806852) + "'", int18 == (-2146806852));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-235439) + "'", int24 == (-235439));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 37474034 + "'", int27 == 37474034);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 431551980 + "'", int30 == 431551980);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract(1925360681, 1672101496);
        int int12 = calculator0.subtract(744123330, (-272902));
        int int15 = calculator0.subtract((-932693954), 691);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 253259185 + "'", int9 == 253259185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 744396232 + "'", int12 == 744396232);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-932694645) + "'", int15 == (-932694645));
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-68), 110);
        int int18 = calculator0.add(1371450554, (-49164339));
        int int21 = calculator0.multiply((-1964453610), 86713455);
        int int24 = calculator0.multiply((-1297438693), 1713901676);
        int int27 = calculator0.divide((-1341611195), 780440743);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1322286215 + "'", int18 == 1322286215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2062827382) + "'", int21 == (-2062827382));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 280533860 + "'", int24 == 280533860);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.divide((int) (byte) 0, 568480);
        int int21 = calculator0.multiply((-26730), 81677);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2111741086 + "'", int21 == 2111741086);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide(0, (-2037396585));
        int int12 = calculator0.subtract(0, (-675399327));
        int int15 = calculator0.multiply(0, 72529);
        int int18 = calculator0.multiply(1017529929, 1457090645);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 675399327 + "'", int12 == 675399327);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-69843395) + "'", int18 == (-69843395));
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((int) '#', (int) (short) -1);
        int int21 = calculator0.subtract((-76), (int) (byte) 10);
        int int24 = calculator0.multiply((-5), 86713457);
        int int27 = calculator0.add((-2146806852), 0);
        int int30 = calculator0.multiply(2064, 736984748);
        int int33 = calculator0.divide(1237147755, (-1263186959));
        int int36 = calculator0.multiply(1002899992, 0);
        int int39 = calculator0.add((-1822007072), (-172530899));
        int int42 = calculator0.multiply((-76), 815031976);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86) + "'", int21 == (-86));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-433567285) + "'", int24 == (-433567285));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2146806852) + "'", int27 == (-2146806852));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 718097088 + "'", int30 == 718097088);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1994537971) + "'", int39 == (-1994537971));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1812888032) + "'", int42 == (-1812888032));
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract((int) (byte) -1, 100);
        int int12 = calculator0.divide(153, 21975629);
        int int15 = calculator0.add(815415403, 236472665);
        int int18 = calculator0.divide(0, 1512046592);
        int int21 = calculator0.subtract((-1263873927), 151224956);
        int int24 = calculator0.add(35, 1106724648);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1051888068 + "'", int15 == 1051888068);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1415098883) + "'", int21 == (-1415098883));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1106724683 + "'", int24 == 1106724683);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.add(867133667, (-121));
        int int21 = calculator0.multiply((-2020), 867133501);
        int int24 = calculator0.subtract((-867133611), 1);
        int int27 = calculator0.add((-235439), 21975739);
        int int30 = calculator0.divide((-855755070), 1571373880);
        int int33 = calculator0.divide(0, 582296876);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133546 + "'", int18 == 867133546);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 736984748 + "'", int21 == 736984748);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867133612) + "'", int24 == (-867133612));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 21740300 + "'", int27 == 21740300);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.multiply((int) (short) 10, (-685834));
        int int21 = calculator0.subtract(867154019, 1925360681);
        int int24 = calculator0.add((-3), 20);
        int int27 = calculator0.add((-2013281986), 1145186611);
        int int30 = calculator0.add((-16428397), (-1459544222));
        int int33 = calculator0.subtract(867149079, (-96347949));
        int int36 = calculator0.divide(1611346769, 258238464);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6858340) + "'", int18 == (-6858340));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1058206662) + "'", int21 == (-1058206662));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-868095375) + "'", int27 == (-868095375));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1475972619) + "'", int30 == (-1475972619));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 963497028 + "'", int33 == 963497028);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 6 + "'", int36 == 6);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.subtract(0, 867133515);
        int int18 = calculator0.multiply(0, 568480);
        int int21 = calculator0.add(1154271220, (-869370670));
        int int24 = calculator0.add(1432976652, 0);
        int int27 = calculator0.multiply(1676364944, 1326084746);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133515) + "'", int15 == (-867133515));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 284900550 + "'", int21 == 284900550);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1432976652 + "'", int24 == 1432976652);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 311387552 + "'", int27 == 311387552);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide((int) (byte) -1, 69);
        int int21 = calculator0.add(822110308, (-88956677));
        int int24 = calculator0.multiply(1058206889, 1754528448);
        int int27 = calculator0.multiply(202130994, 692692);
        int int30 = calculator0.divide(1501859346, 16142423);
        int int33 = calculator0.add(943052700, (-13312));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 733153631 + "'", int21 == 733153631);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-164656960) + "'", int24 == (-164656960));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1411353752) + "'", int27 == (-1411353752));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 93 + "'", int30 == 93);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 943039388 + "'", int33 == 943039388);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.add((-76), (-76));
        int int27 = calculator0.multiply((-6858340), 3563280);
        int int30 = calculator0.divide((-37), (-211766202));
        int int33 = calculator0.divide((-13703472), (-178330532));
        int int36 = calculator0.multiply(351515216, 496549099);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-152) + "'", int24 == (-152));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 178159040 + "'", int27 == 178159040);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 573009776 + "'", int36 == 573009776);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.multiply(2, (-86713457));
        int int24 = calculator0.add(86713344, 131);
        int int27 = calculator0.subtract(34, (-290738176));
        int int30 = calculator0.multiply(88947384, 33);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173426914) + "'", int21 == (-173426914));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 86713475 + "'", int24 == 86713475);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 290738210 + "'", int27 == 290738210);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1359703624) + "'", int30 == (-1359703624));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.add((-109415539), (-111));
        int int24 = calculator0.subtract((-6867620), (-341775412));
        int int27 = calculator0.divide(1700666764, (-1685643349));
        int int30 = calculator0.multiply((-397900692), (-318674077));
        int int33 = calculator0.add(1373662594, 631533728);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-109415650) + "'", int21 == (-109415650));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 334907792 + "'", int24 == 334907792);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1546626620) + "'", int30 == (-1546626620));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2005196322 + "'", int33 == 2005196322);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.add((-2146806784), 0);
        int int12 = calculator0.add((-9433), 2110251662);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2146806784) + "'", int9 == (-2146806784));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2110242229 + "'", int12 == 2110242229);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.add(1726883057, 7955592);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1734838649 + "'", int12 == 1734838649);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        int int15 = calculator0.multiply(1978473568, 1810185237);
        int int18 = calculator0.divide((-402505884), (-173426797));
        int int21 = calculator0.divide(0, 867133515);
        int int24 = calculator0.multiply(114096, 2139980843);
        int int27 = calculator0.subtract((-867743227), (-10));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1057369120) + "'", int15 == (-1057369120));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1341547376) + "'", int24 == (-1341547376));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-867743217) + "'", int27 == (-867743217));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.multiply(867133591, (-867133440));
        int int15 = calculator0.subtract((-178319437), 1739617460);
        int int18 = calculator0.multiply((-976), 2126380082);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 692692992 + "'", int12 == 692692992);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1917936897) + "'", int15 == (-1917936897));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-877756064) + "'", int18 == (-877756064));
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.subtract(1395, 95);
        int int18 = calculator0.divide((-1827707776), (-2104668974));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1300 + "'", int15 == 1300);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.subtract((-1), 9);
        int int18 = calculator0.subtract((-2243320), 86713381);
        int int21 = calculator0.add(991518632, 441187696);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-88956701) + "'", int18 == (-88956701));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1432706328 + "'", int21 == 1432706328);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((int) (short) 0, 110);
        int int21 = calculator0.multiply((-867133491), (-9280));
        int int24 = calculator0.multiply((-1769916224), (-173426797));
        int int27 = calculator0.subtract(1049326020, 1371450554);
        int int30 = calculator0.divide((-2040839151), 1395);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42260032 + "'", int24 == 42260032);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-322124534) + "'", int27 == (-322124534));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1462967) + "'", int30 == (-1462967));
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide((int) (short) 10, (-173426914));
        int int21 = calculator0.add((-109415445), 1145169864);
        int int24 = calculator0.add((-665227), (-1269632422));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1035754419 + "'", int21 == 1035754419);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1270297649) + "'", int24 == (-1270297649));
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide(100, 98);
        int int21 = calculator0.multiply(3563280, 867133546);
        int int24 = calculator0.subtract(15005, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1494342816 + "'", int21 == 1494342816);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15005 + "'", int24 == 15005);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.divide((-1248231612), 1754528548);
        int int21 = calculator0.subtract(1020465408, 0);
        int int24 = calculator0.multiply(21, (-520185));
        int int27 = calculator0.subtract((-12792939), 1530958111);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1020465408 + "'", int21 == 1020465408);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10923885) + "'", int24 == (-10923885));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1543751050) + "'", int27 == (-1543751050));
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.divide((-1237148864), 153);
        int int12 = calculator0.add(164584658, (-853113394));
        int int15 = calculator0.divide(827072948, (-850335808));
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8085940) + "'", int9 == (-8085940));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-688528736) + "'", int12 == (-688528736));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.subtract((-1448314236), (-105841579));
        int int18 = calculator0.subtract(441187696, (-1185779371));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1342472657) + "'", int15 == (-1342472657));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1626967067 + "'", int18 == 1626967067);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.add((-56), 0);
        int int18 = calculator0.subtract(201935616, 573009776);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-56) + "'", int15 == (-56));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-371074160) + "'", int18 == (-371074160));
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.subtract(1271882624, 3400);
        int int24 = calculator0.add(287137963, 1);
        int int27 = calculator0.add((-97), 520149);
        int int30 = calculator0.divide(1645239338, 104946);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 287137964 + "'", int24 == 287137964);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 520052 + "'", int27 == 520052);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15677 + "'", int30 == 15677);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(1145179144, 100);
        int int15 = calculator0.multiply((-380871040), 202128424);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1145179044 + "'", int12 == 1145179044);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-938163200) + "'", int15 == (-938163200));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.divide((-52), (-2243320));
        int int27 = calculator0.multiply(520484954, 1944410221);
        int int30 = calculator0.add(1733678745, (-1685150444));
        int int33 = calculator0.subtract((-14300), 1047786071);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-647254446) + "'", int27 == (-647254446));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 48528301 + "'", int30 == 48528301);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1047800371) + "'", int33 == (-1047800371));
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(76, 692692992);
        int int21 = calculator0.subtract(51, (-665254));
        int int24 = calculator0.add(520201, 0);
        int int27 = calculator0.divide((-774138863), (int) '4');
        int int30 = calculator0.multiply(1444218927, 1767113472);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 665305 + "'", int21 == 665305);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 520201 + "'", int24 == 520201);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-14887285) + "'", int27 == (-14887285));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 897879296 + "'", int30 == 897879296);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(2243220, (int) '4');
        int int21 = calculator0.subtract(0, 867154019);
        int int24 = calculator0.divide((-1769916127), 665);
        int int27 = calculator0.divide(108673964, 236472665);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 43138 + "'", int18 == 43138);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-867154019) + "'", int21 == (-867154019));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2661528) + "'", int24 == (-2661528));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.subtract((-86), (-109415563));
        int int15 = calculator0.add(0, 757944224);
        int int18 = calculator0.add(2, 1152037536);
        int int21 = calculator0.add(548010, (-1985610752));
        int int24 = calculator0.multiply(2139980843, 95596657);
        int int27 = calculator0.multiply((-887), (-477385434));
        int int30 = calculator0.multiply(520297, 48170496);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109415477 + "'", int12 == 109415477);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 757944224 + "'", int15 == 757944224);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1152037538 + "'", int18 == 1152037538);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1985062742) + "'", int21 == (-1985062742));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1429923579 + "'", int24 == 1429923579);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1760882346) + "'", int27 == (-1760882346));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1830385152 + "'", int30 == 1830385152);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.subtract(1810185236, 1484018126);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 326167110 + "'", int12 == 326167110);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.divide(25, (-1923));
        int int12 = calculator0.multiply((-15300), 34);
        int int15 = calculator0.subtract(1152037484, (-109415563));
        int int18 = calculator0.divide(1810186246, (-78));
        int int21 = calculator0.subtract(1076984144, 197);
        int int24 = calculator0.subtract(109413727, 373040344);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-520200) + "'", int12 == (-520200));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1261453047 + "'", int15 == 1261453047);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-23207515) + "'", int18 == (-23207515));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1076983947 + "'", int21 == 1076983947);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-263626617) + "'", int24 == (-263626617));
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.subtract(100, (-1));
        int int21 = calculator0.subtract(897879296, (-915066734));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1812946030 + "'", int21 == 1812946030);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(1145179144, 100);
        int int15 = calculator0.subtract(1237148811, (-240317368));
        int int18 = calculator0.subtract((-685328092), 1733781449);
        int int21 = calculator0.add(120216076, 74106190);
        int int24 = calculator0.subtract(1527277189, 282034071);
        int int27 = calculator0.subtract((-1606434250), 1501859346);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1145179044 + "'", int12 == 1145179044);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1477466179 + "'", int15 == 1477466179);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1875857755 + "'", int18 == 1875857755);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 194322266 + "'", int21 == 194322266);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1245243118 + "'", int24 == 1245243118);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1186673700 + "'", int27 == 1186673700);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.add((-2146806784), 0);
        int int12 = calculator0.subtract(520297, 96);
        int int15 = calculator0.multiply(736984748, (-290738176));
        int int18 = calculator0.subtract((-1744877388), 1222015232);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2146806784) + "'", int9 == (-2146806784));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520201 + "'", int12 == 520201);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-872792064) + "'", int15 == (-872792064));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1328074676 + "'", int18 == 1328074676);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply(0, 1810705533);
        int int24 = calculator0.subtract((-341775360), 52);
        int int27 = calculator0.multiply(1772546271, 88947384);
        int int30 = calculator0.add((-938163200), (-1537712065));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-341775412) + "'", int24 == (-341775412));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 650962504 + "'", int27 == 650962504);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1819092031 + "'", int30 == 1819092031);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.add(867133491, (int) (byte) 100);
        int int27 = calculator0.divide(86713344, 9347);
        int int30 = calculator0.subtract((-36), (-520185));
        int int33 = calculator0.add((-757944310), (-29));
        int int36 = calculator0.multiply((-1777146311), (-45));
        java.lang.Class<?> wildcardClass37 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 867133591 + "'", int24 == 867133591);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9277 + "'", int27 == 9277);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 520149 + "'", int30 == 520149);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-757944339) + "'", int33 == (-757944339));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1632794629) + "'", int36 == (-1632794629));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.multiply((int) (byte) -1, (int) '4');
        int int24 = calculator0.add((-1250435409), (-1357151573));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-52) + "'", int21 == (-52));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1687380314 + "'", int24 == 1687380314);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        int int15 = calculator0.multiply(1978473568, 1810185237);
        int int18 = calculator0.add((-10), 0);
        int int21 = calculator0.divide((-1153791657), 692692);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1057369120) + "'", int15 == (-1057369120));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1665) + "'", int21 == (-1665));
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.subtract((-86), (-109415563));
        int int15 = calculator0.subtract(18, 334907792);
        int int18 = calculator0.divide(252505144, (-867154019));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109415477 + "'", int12 == 109415477);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-334907774) + "'", int15 == (-334907774));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        int int15 = calculator0.multiply(1978473568, 1810185237);
        int int18 = calculator0.divide((-402505884), (-173426797));
        int int21 = calculator0.divide(0, 867133515);
        int int24 = calculator0.multiply(114096, 2139980843);
        int int27 = calculator0.divide((-15200), (-733999));
        int int30 = calculator0.multiply(2003425405, 44768859);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1057369120) + "'", int15 == (-1057369120));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1341547376) + "'", int24 == (-1341547376));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1870502511 + "'", int30 == 1870502511);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide((-1769916224), (-36));
        int int21 = calculator0.add(867133591, 76);
        int int24 = calculator0.divide(42927, (-7955541));
        int int27 = calculator0.divide((-15), (-1152034604));
        int int30 = calculator0.add((-1248191799), (-2243610));
        int int33 = calculator0.multiply((-45), 393135424);
        int int36 = calculator0.subtract(780440642, 940420);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 867133667 + "'", int21 == 867133667);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1250435409) + "'", int30 == (-1250435409));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-511224896) + "'", int33 == (-511224896));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 779500222 + "'", int36 == 779500222);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(67686400, (-111));
        int int21 = calculator0.multiply(867133381, 867133420);
        int int24 = calculator0.subtract((-37489334), 1632827392);
        int int27 = calculator0.subtract(180712372, (-1240110784));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-609787) + "'", int18 == (-609787));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1730079900 + "'", int21 == 1730079900);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1670316726) + "'", int24 == (-1670316726));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1420823156 + "'", int27 == 1420823156);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.multiply(867133511, (-7955431));
        int int15 = calculator0.divide((-1359151923), (-109415445));
        int int18 = calculator0.add(573738264, (-41150040));
        int int21 = calculator0.add((-166920604), 1727146517);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1037464303 + "'", int12 == 1037464303);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 532588224 + "'", int18 == 532588224);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1560225913 + "'", int21 == 1560225913);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.divide(692692992, (-1010));
        int int21 = calculator0.multiply((-36), (-867133571));
        int int24 = calculator0.divide((-2020), 241122679);
        int int27 = calculator0.subtract((-341784793), 18);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-685834) + "'", int18 == (-685834));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1152037484 + "'", int21 == 1152037484);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-341784811) + "'", int27 == (-341784811));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.add(86713457, (-15300));
        int int21 = calculator0.subtract(867133616, 196);
        int int24 = calculator0.divide(86698157, (-7955541));
        int int27 = calculator0.subtract((-198788080), 1454119969);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86698157 + "'", int18 == 86698157);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 867133420 + "'", int21 == 867133420);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1652908049) + "'", int27 == (-1652908049));
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-68), 110);
        int int18 = calculator0.add(1371450554, (-49164339));
        int int21 = calculator0.subtract((-934840515), (-8));
        int int24 = calculator0.divide(1897078486, (-7325507));
        int int27 = calculator0.add(130, 1860440598);
        int int30 = calculator0.divide((-1269671715), 110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1322286215 + "'", int18 == 1322286215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-934840507) + "'", int21 == (-934840507));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-258) + "'", int24 == (-258));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1860440728 + "'", int27 == 1860440728);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-11542470) + "'", int30 == (-11542470));
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.multiply(34, (-685834));
        int int21 = calculator0.subtract((-74870788), 0);
        int int24 = calculator0.subtract(887128884, (-685834));
        int int27 = calculator0.multiply(258238464, (-1919));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-23318356) + "'", int18 == (-23318356));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-74870788) + "'", int21 == (-74870788));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 887814718 + "'", int24 == 887814718);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1638373376) + "'", int27 == (-1638373376));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) ' ', 109415477);
        int int15 = calculator0.subtract(1037464303, (-1469333649));
        int int18 = calculator0.add((-15300), 1935);
        int int21 = calculator0.subtract((-198788080), 493685401);
        int int24 = calculator0.add((-1475972619), 1339770992);
        int int27 = calculator0.add(2118708572, 2075617088);
        int int30 = calculator0.multiply(1820836164, 1769916224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-109415445) + "'", int12 == (-109415445));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1788169344) + "'", int15 == (-1788169344));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13365) + "'", int18 == (-13365));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-692473481) + "'", int21 == (-692473481));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-136201627) + "'", int24 == (-136201627));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-100641636) + "'", int27 == (-100641636));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1398526720) + "'", int30 == (-1398526720));
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply(0, 0);
        int int18 = calculator0.multiply(867133667, (-97));
        int int21 = calculator0.subtract((-173426797), 9277);
        int int24 = calculator0.subtract((-112879003), 1810186246);
        int int27 = calculator0.add(15, 1269639304);
        int int30 = calculator0.subtract((-7600), 867133420);
        int int33 = calculator0.subtract((-1555994363), 1012025939);
        int int36 = calculator0.add((-3463464), 287137964);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1787380221 + "'", int18 == 1787380221);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173436074) + "'", int21 == (-173436074));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1923065249) + "'", int24 == (-1923065249));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1269639319 + "'", int27 == 1269639319);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-867141020) + "'", int30 == (-867141020));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1726946994 + "'", int33 == 1726946994);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 283674500 + "'", int36 == 283674500);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.multiply((-9312), (-9312));
        int int15 = calculator0.subtract(867133515, (-6));
        int int18 = calculator0.add(867153943, (-1700666664));
        int int21 = calculator0.multiply(1598732630, 867133546);
        int int24 = calculator0.multiply(1693566793, (-257235584));
        int int27 = calculator0.multiply(100, 944516863);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713344 + "'", int12 == 86713344);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133521 + "'", int15 == 867133521);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-833512721) + "'", int18 == (-833512721));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1543131748) + "'", int21 == (-1543131748));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2036207232) + "'", int24 == (-2036207232));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-37594212) + "'", int27 == (-37594212));
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide((-867133571), (-7600));
        int int21 = calculator0.subtract((-8085940), 757717952);
        int int24 = calculator0.divide((-1670316726), (-938163200));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 114096 + "'", int18 == 114096);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-765803892) + "'", int21 == (-765803892));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.add(1152037484, (-6858340));
        int int18 = calculator0.divide(4213, 867133667);
        int int21 = calculator0.subtract(0, 86713457);
        int int24 = calculator0.divide((-1897778925), (-1951649816));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86713457) + "'", int21 == (-86713457));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.add(1152037484, (-6858340));
        int int18 = calculator0.divide(4213, 867133667);
        int int21 = calculator0.divide((-1123990489), 29811430);
        int int24 = calculator0.divide(1455335579, (-1115015376));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-37) + "'", int21 == (-37));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((int) '#', (int) ' ');
        int int18 = calculator0.subtract(887061504, (-1263873927));
        int int21 = calculator0.multiply((-15), 707601614);
        int int24 = calculator0.multiply((-24578), 153);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2144031865) + "'", int18 == (-2144031865));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2024089618) + "'", int21 == (-2024089618));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3760434) + "'", int24 == (-3760434));
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.add((-3528), (-7567));
        int int24 = calculator0.divide((-346346486), (int) (short) 100);
        int int27 = calculator0.multiply((-214132678), (-341775360));
        int int30 = calculator0.add((-1433052896), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11095) + "'", int21 == (-11095));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3463464) + "'", int24 == (-3463464));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1049982976 + "'", int27 == 1049982976);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1433052896) + "'", int30 == (-1433052896));
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide((-1769916224), (-36));
        int int21 = calculator0.add(867133591, 76);
        int int24 = calculator0.divide(42927, (-7955541));
        int int27 = calculator0.divide((-15), (-1152034604));
        int int30 = calculator0.add((-1248191799), (-2243610));
        int int33 = calculator0.multiply((-45), 393135424);
        java.lang.Class<?> wildcardClass34 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 867133667 + "'", int21 == 867133667);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1250435409) + "'", int30 == (-1250435409));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-511224896) + "'", int33 == (-511224896));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-68), 110);
        int int18 = calculator0.add(1371450554, (-49164339));
        int int21 = calculator0.add(1152037331, (-867133342));
        int int24 = calculator0.divide((-20), (-8));
        int int27 = calculator0.divide(2243220, (-26411181));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1322286215 + "'", int18 == 1322286215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 284903989 + "'", int21 == 284903989);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.subtract((-86), (-109415563));
        int int15 = calculator0.add(0, 757944224);
        int int18 = calculator0.add(2, 1152037536);
        int int21 = calculator0.add(548010, (-1985610752));
        int int24 = calculator0.subtract((-11095), (-902782633));
        int int27 = calculator0.add((-2093894088), 1779063741);
        int int30 = calculator0.divide(1014518652, (-258));
        int int33 = calculator0.multiply(0, 956080105);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109415477 + "'", int12 == 109415477);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 757944224 + "'", int15 == 757944224);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1152037538 + "'", int18 == 1152037538);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1985062742) + "'", int21 == (-1985062742));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 902771538 + "'", int24 == 902771538);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-314830347) + "'", int27 == (-314830347));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-3932242) + "'", int30 == (-3932242));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add(1, (-867133440));
        int int18 = calculator0.divide((-101), (-1923));
        int int21 = calculator0.divide(3400, 520201);
        int int24 = calculator0.multiply((-841742365), 867138284);
        int int27 = calculator0.divide((-833512721), (int) (byte) 1);
        int int30 = calculator0.add((-1555994242), (-7480));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133439) + "'", int15 == (-867133439));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1751544644 + "'", int24 == 1751544644);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-833512721) + "'", int27 == (-833512721));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1556001722) + "'", int30 == (-1556001722));
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(95, 0);
        int int15 = calculator0.multiply((-867138628), (-15200));
        int int18 = calculator0.subtract(1730079900, (-6858340));
        int int21 = calculator0.subtract((-867133329), (-97460156));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-747485824) + "'", int15 == (-747485824));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1736938240 + "'", int18 == 1736938240);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-769673173) + "'", int21 == (-769673173));
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(95, 0);
        int int15 = calculator0.multiply((-867138628), (-15200));
        int int18 = calculator0.multiply(100, 34);
        int int21 = calculator0.add(1733781449, 0);
        int int24 = calculator0.divide(86713455, (-1007548917));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-747485824) + "'", int15 == (-747485824));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3400 + "'", int18 == 3400);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1733781449 + "'", int21 == 1733781449);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply((-76), (-7480));
        int int9 = calculator0.add(10107303, (-555681720));
        int int12 = calculator0.multiply((-1401805725), 170434784);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 568480 + "'", int6 == 568480);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-545574417) + "'", int9 == (-545574417));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-938101088) + "'", int12 == (-938101088));
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract(9, (-100));
        int int15 = calculator0.divide(76, 692692992);
        int int18 = calculator0.add((int) 'a', (-867133439));
        int int21 = calculator0.add((-9312), (-1555994242));
        int int24 = calculator0.add((-1202658055), (-38255));
        int int27 = calculator0.subtract(9012, 1497091025);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109 + "'", int12 == 109);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-867133342) + "'", int18 == (-867133342));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1556003554) + "'", int21 == (-1556003554));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1202696310) + "'", int24 == (-1202696310));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1497082013) + "'", int27 == (-1497082013));
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.subtract((-111), (-111));
        int int24 = calculator0.add(197, (-757113551));
        int int27 = calculator0.subtract((-1889283420), 0);
        int int30 = calculator0.multiply((-1992851744), 1486954452);
        int int33 = calculator0.subtract((-1538240), 1145651162);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-757113354) + "'", int24 == (-757113354));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1889283420) + "'", int27 == (-1889283420));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 624046464 + "'", int30 == 624046464);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1147189402) + "'", int33 == (-1147189402));
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-68), 110);
        int int18 = calculator0.add(1371450554, (-49164339));
        int int21 = calculator0.subtract((-934840515), (-8));
        int int24 = calculator0.divide(1897078486, (-7325507));
        int int27 = calculator0.add(130, 1860440598);
        int int30 = calculator0.multiply((-402505884), (-1262943204));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1322286215 + "'", int18 == 1322286215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-934840507) + "'", int21 == (-934840507));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-258) + "'", int24 == (-258));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1860440728 + "'", int27 == 1860440728);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2004844816) + "'", int30 == (-2004844816));
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(2243220, (int) '4');
        int int21 = calculator0.divide(0, (-88));
        int int24 = calculator0.multiply(109415477, 1669504623);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 43138 + "'", int18 == 43138);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-228949765) + "'", int24 == (-228949765));
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.multiply((-96348159), (-9280));
        int int15 = calculator0.divide((-5), 202);
        int int18 = calculator0.divide(110, 853334016);
        int int21 = calculator0.divide(67686496, 867154995);
        int int24 = calculator0.multiply((-2117573600), (-989528052));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 757717952 + "'", int12 == 757717952);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1442532992) + "'", int24 == (-1442532992));
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.multiply((-46), (-152));
        int int27 = calculator0.divide(9277, (int) 'a');
        int int30 = calculator0.subtract((-1240110784), 1486954504);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = calculator0.divide(91806, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6992 + "'", int24 == 6992);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 95 + "'", int27 == 95);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1567902008 + "'", int30 == 1567902008);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.subtract(0, (-747485824));
        int int24 = calculator0.divide(32, (-127900925));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 747485824 + "'", int21 == 747485824);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.multiply((int) (short) -1, 49164339);
        int int12 = calculator0.add(86698157, 21975739);
        int int15 = calculator0.multiply(1429824755, 1739617460);
        int int18 = calculator0.add((-1110676512), 1571373880);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-49164339) + "'", int9 == (-49164339));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 108673896 + "'", int12 == 108673896);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 438900444 + "'", int15 == 438900444);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 460697368 + "'", int18 == 460697368);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract(9, (-100));
        int int15 = calculator0.divide(76, 692692992);
        int int18 = calculator0.add((int) 'a', (-867133439));
        int int21 = calculator0.add(69, (-3528));
        int int24 = calculator0.subtract(21975739, (-932693954));
        int int27 = calculator0.multiply(0, 2016961242);
        int int30 = calculator0.divide((-134281536), 114096);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109 + "'", int12 == 109);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-867133342) + "'", int18 == (-867133342));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3459) + "'", int21 == (-3459));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 954669693 + "'", int24 == 954669693);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1176) + "'", int30 == (-1176));
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.subtract((-86713342), 86713455);
        int int21 = calculator0.add((-173426914), 1734308238);
        int int24 = calculator0.divide((-867138628), 98);
        int int27 = calculator0.divide(568480, (-636451253));
        int int30 = calculator0.multiply(378379962, 306354380);
        int int33 = calculator0.subtract(976529318, (-1951882450));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1560881324 + "'", int21 == 1560881324);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-8848353) + "'", int24 == (-8848353));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 252505144 + "'", int30 == 252505144);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1366555528) + "'", int33 == (-1366555528));
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.subtract((-7955541), (-867133515));
        int int18 = calculator0.multiply((-341775360), (-109415539));
        int int21 = calculator0.multiply(280533860, (-240317368));
        int int24 = calculator0.subtract((-1007659676), (-195456));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 859177974 + "'", int15 == 859177974);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1985610752) + "'", int18 == (-1985610752));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2117573600) + "'", int21 == (-2117573600));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1007464220) + "'", int24 == (-1007464220));
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (byte) 1, 96);
        int int24 = calculator0.multiply(2, (-1010));
        int int27 = calculator0.subtract((-7955541), (-110));
        int int30 = calculator0.multiply((-49173772), 3563280);
        int int33 = calculator0.subtract(49164439, (-2131780436));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2020) + "'", int24 == (-2020));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-7955431) + "'", int27 == (-7955431));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1862482752 + "'", int30 == 1862482752);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2114022421) + "'", int33 == (-2114022421));
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.subtract(1258058047, (-339618637));
        int int24 = calculator0.add((-745367358), 902777444);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1597676684 + "'", int21 == 1597676684);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 157410086 + "'", int24 == 157410086);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.subtract((-86713342), 86713455);
        int int21 = calculator0.subtract(1, (-152));
        int int24 = calculator0.subtract((-6867620), 1474273060);
        int int27 = calculator0.subtract((-2661528), (-1263873927));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 153 + "'", int21 == 153);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1481140680) + "'", int24 == (-1481140680));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1261212399 + "'", int27 == 1261212399);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-68), 110);
        int int18 = calculator0.add(1371450554, (-49164339));
        int int21 = calculator0.multiply((-1964453610), 86713455);
        int int24 = calculator0.multiply((-1297438693), 1713901676);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = calculator0.divide(1610593080, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1322286215 + "'", int18 == 1322286215);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2062827382) + "'", int21 == (-2062827382));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 280533860 + "'", int24 == 280533860);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((-68), (int) (byte) 10);
        int int21 = calculator0.divide(96, (-68));
        int int24 = calculator0.divide((-15300), (-520200));
        int int27 = calculator0.divide(1237148864, 33);
        int int30 = calculator0.add((-1700666664), (-934840515));
        int int33 = calculator0.multiply((-1322291616), 428644672);
        int int36 = calculator0.add((-52), (-1555995480));
        java.lang.Class<?> wildcardClass37 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 37489359 + "'", int27 == 37489359);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1659460117 + "'", int30 == 1659460117);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1632827392 + "'", int33 == 1632827392);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1555995532) + "'", int36 == (-1555995532));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.divide(692692992, (-1010));
        int int21 = calculator0.multiply((-36), (-867133571));
        int int24 = calculator0.divide(101, 9);
        int int27 = calculator0.subtract(101, 0);
        int int30 = calculator0.divide(1106724648, 1448299036);
        int int33 = calculator0.subtract((-1145651066), (-1700666664));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-685834) + "'", int18 == (-685834));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1152037484 + "'", int21 == 1152037484);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 101 + "'", int27 == 101);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 555015598 + "'", int33 == 555015598);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.multiply((int) (byte) -1, (int) '4');
        int int24 = calculator0.multiply((-867133439), (-68));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-52) + "'", int21 == (-52));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1164468292) + "'", int24 == (-1164468292));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.multiply(0, (-170066666));
        int int21 = calculator0.subtract((-867138628), 9552704);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-876691332) + "'", int21 == (-876691332));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.multiply((-68), (int) (short) 1);
        int int18 = calculator0.add((-844637556), 1154271539);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-68) + "'", int15 == (-68));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 309633983 + "'", int18 == 309633983);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, (-49164339));
        int int9 = calculator0.multiply(1809614551, (-867133611));
        int int12 = calculator0.divide((-707525376), (-1251462553));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-49164339) + "'", int6 == (-49164339));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1525782115 + "'", int9 == 1525782115);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.multiply(1322286215, 867133501);
        int int21 = calculator0.subtract(0, (-520020));
        int int24 = calculator0.multiply(7955592, (-287593));
        int int27 = calculator0.divide(0, 1228813600);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2139980843 + "'", int18 == 2139980843);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 520020 + "'", int21 == 520020);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1244998712 + "'", int24 == 1244998712);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.add(867133491, (int) (byte) 100);
        int int27 = calculator0.divide(86713344, 9347);
        int int30 = calculator0.add(867133491, 9347);
        int int33 = calculator0.subtract(887128884, (-586397423));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 867133591 + "'", int24 == 867133591);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9277 + "'", int27 == 9277);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 867142838 + "'", int30 == 867142838);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1473526307 + "'", int33 == 1473526307);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract((int) (byte) -1, 100);
        int int12 = calculator0.add((-9433), (-341775360));
        int int15 = calculator0.add(1154271539, (-1879178559));
        int int18 = calculator0.add(0, 1542690885);
        int int21 = calculator0.add(1810692168, (-2033296844));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-341784793) + "'", int12 == (-341784793));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-724907020) + "'", int15 == (-724907020));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1542690885 + "'", int18 == 1542690885);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-222604676) + "'", int21 == (-222604676));
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.subtract((-1), (-97));
        int int21 = calculator0.add((-97), 98);
        int int24 = calculator0.divide(178159040, (-867158093));
        int int27 = calculator0.divide((-152), (-45247));
        int int30 = calculator0.multiply(867135459, (-1848235514));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 423222610 + "'", int30 == 423222610);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.add((-76), (-76));
        int int27 = calculator0.multiply((-6858340), 3563280);
        int int30 = calculator0.divide((-258), 1152037538);
        int int33 = calculator0.add((-164358470), (-555681721));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-152) + "'", int24 == (-152));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 178159040 + "'", int27 == 178159040);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-720040191) + "'", int33 == (-720040191));
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.subtract(96, 97);
        int int15 = calculator0.multiply((-45), (-23318356));
        int int18 = calculator0.divide((-1322291616), 25);
        int int21 = calculator0.divide(15, 1323847021);
        int int24 = calculator0.subtract(1152037484, 98);
        int int27 = calculator0.divide(1581845912, (-1685448220));
        int int30 = calculator0.add(1145169847, 1955142987);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-52891664) + "'", int18 == (-52891664));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1152037386 + "'", int24 == 1152037386);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1194654462) + "'", int30 == (-1194654462));
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.divide(86698157, 867133515);
        int int24 = calculator0.multiply(859792975, 867138284);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 573896404 + "'", int24 == 573896404);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.subtract(0, (-110));
        int int24 = calculator0.divide((int) (byte) -1, 867133667);
        int int27 = calculator0.add((-2146806784), 119647596);
        int int30 = calculator0.multiply((-26411181), 0);
        int int33 = calculator0.subtract((-1555994242), 1202216254);
        int int36 = calculator0.add((-1495629227), (-2144684316));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 110 + "'", int21 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2027159188) + "'", int27 == (-2027159188));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1536756800 + "'", int33 == 1536756800);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 654653753 + "'", int36 == 654653753);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract(76, (-867133439));
        int int18 = calculator0.subtract((-15200), (int) (short) 100);
        int int21 = calculator0.add(1269639304, (-58));
        int int24 = calculator0.divide(3400, 867153943);
        int int27 = calculator0.subtract((-1542999794), (-1415098883));
        int int30 = calculator0.divide(4213, 221294303);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-15300) + "'", int18 == (-15300));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1269639246 + "'", int21 == 1269639246);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-127900911) + "'", int27 == (-127900911));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract(76, (-867133439));
        int int18 = calculator0.subtract((-976), 4213);
        int int21 = calculator0.divide(346346496, (-844637556));
        int int24 = calculator0.multiply(598674325, 1423849605);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-5189) + "'", int18 == (-5189));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1011901335) + "'", int24 == (-1011901335));
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        int int15 = calculator0.multiply(1978473568, 1810185237);
        int int18 = calculator0.multiply((-211766202), 110);
        int int21 = calculator0.add(1751544644, 86605184);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1057369120) + "'", int15 == (-1057369120));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1819445740) + "'", int18 == (-1819445740));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1838149828 + "'", int21 == 1838149828);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.multiply((-86713457), (-2146806784));
        int int18 = calculator0.add(1420823156, (-13884813));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-341775360) + "'", int15 == (-341775360));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1406938343 + "'", int18 == 1406938343);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.add((int) 'a', (-2020));
        int int15 = calculator0.divide((-15300), (-1964453610));
        int int18 = calculator0.add((-404066219), (-965191816));
        int int21 = calculator0.divide(1272748659, 1503190044);
        int int24 = calculator0.multiply(2233940, (-1587684236));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1923) + "'", int12 == (-1923));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1369258035) + "'", int18 == (-1369258035));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1260801552 + "'", int24 == 1260801552);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.add(2118708572, 2);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2118708574 + "'", int18 == 2118708574);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract(9, (-100));
        int int15 = calculator0.add(1733781449, 18);
        int int18 = calculator0.divide(1898423450, (-135309308));
        int int21 = calculator0.subtract(0, 1261453047);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109 + "'", int12 == 109);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1733781467 + "'", int15 == 1733781467);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-14) + "'", int18 == (-14));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1261453047) + "'", int21 == (-1261453047));
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(67686400, (-111));
        int int21 = calculator0.multiply(2110251662, 153);
        int int24 = calculator0.multiply(2129948464, 1269639246);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-609787) + "'", int18 == (-609787));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 745957086 + "'", int21 == 745957086);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 323575968 + "'", int24 == 323575968);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract(76, (-867133439));
        int int18 = calculator0.multiply(33, 213009);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7029297 + "'", int18 == 7029297);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.multiply((int) (byte) -1, (int) '4');
        int int24 = calculator0.multiply((-867133439), (-68));
        int int27 = calculator0.subtract((-58), (-1497046780));
        int int30 = calculator0.multiply(2233940, 1754528448);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-52) + "'", int21 == (-52));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1164468292) + "'", int24 == (-1164468292));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1497046722 + "'", int27 == 1497046722);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1436206848 + "'", int30 == 1436206848);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.add((int) (byte) 1, (int) ' ');
        int int15 = calculator0.add((-362955086), 428644672);
        int int18 = calculator0.subtract((-97), 1486954454);
        int int21 = calculator0.subtract((-1271895989), 654086037);
        int int24 = calculator0.add(1532796050, 1049326020);
        int int27 = calculator0.multiply((-23), 1510103384);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 65689586 + "'", int15 == 65689586);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1486954551) + "'", int18 == (-1486954551));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1925982026) + "'", int21 == (-1925982026));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1712845226) + "'", int24 == (-1712845226));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-372639464) + "'", int27 == (-372639464));
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.subtract(2, 86713344);
        int int18 = calculator0.multiply(20, 1154271478);
        int int21 = calculator0.divide(173200584, 49164439);
        int int24 = calculator0.multiply((-49164372), 86144901);
        int int27 = calculator0.divide((-173436074), (-1259396283));
        int int30 = calculator0.subtract(1049982976, 718097088);
        int int33 = calculator0.divide(496549099, 2101335786);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713342) + "'", int15 == (-86713342));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1610593080 + "'", int18 == 1610593080);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1298016164) + "'", int24 == (-1298016164));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 331885888 + "'", int30 == 331885888);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.add((int) (byte) 1, (int) ' ');
        int int15 = calculator0.subtract(754840506, (-1984132447));
        int int18 = calculator0.multiply(1, 94);
        int int21 = calculator0.multiply(1371450554, 2130112384);
        int int24 = calculator0.add((-3528), (-1917936897));
        int int27 = calculator0.subtract(86144901, (-290738176));
        int int30 = calculator0.add((-7596), (-1162705156));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1555994343) + "'", int15 == (-1555994343));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 94 + "'", int18 == 94);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1767113472 + "'", int21 == 1767113472);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1917940425) + "'", int24 == (-1917940425));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 376883077 + "'", int27 == 376883077);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1162712752) + "'", int30 == (-1162712752));
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.subtract(867133420, 1269639304);
        int int21 = calculator0.subtract((-2146806784), (-1359151923));
        int int24 = calculator0.divide((-1802498291), 29811430);
        int int27 = calculator0.divide(266702322, 41650243);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-402505884) + "'", int18 == (-402505884));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-787654861) + "'", int21 == (-787654861));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-60) + "'", int24 == (-60));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, (-49164339));
        int int9 = calculator0.multiply(1809614551, (-867133611));
        int int12 = calculator0.add(284903972, (-6858340));
        int int15 = calculator0.subtract(850335808, (-380871040));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-49164339) + "'", int6 == (-49164339));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1525782115 + "'", int9 == 1525782115);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 278045632 + "'", int12 == 278045632);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1231206848 + "'", int15 == 1231206848);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((int) (short) 0, 34);
        int int15 = calculator0.add((-1411353752), (-867743227));
        int int18 = calculator0.multiply(67437664, (-216614656));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2015870317 + "'", int15 == 2015870317);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 543776768 + "'", int18 == 543776768);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.subtract(1271882624, 3400);
        int int24 = calculator0.add(1754528448, 72529);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = calculator0.divide((-86713651), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1754600977 + "'", int24 == 1754600977);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.add(20580, (-241122442));
        int int21 = calculator0.add(846070065, (-1925360682));
        int int24 = calculator0.subtract((-1015476224), 0);
        int int27 = calculator0.subtract((-1462967), 582296876);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-241101862) + "'", int18 == (-241101862));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1079290617) + "'", int21 == (-1079290617));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1015476224) + "'", int24 == (-1015476224));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-583759843) + "'", int27 == (-583759843));
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.add((-2146806784), 0);
        int int12 = calculator0.subtract(520297, 96);
        int int15 = calculator0.divide(20580, 780440677);
        int int18 = calculator0.add((-1698572449), 1217446272);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2146806784) + "'", int9 == (-2146806784));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520201 + "'", int12 == 520201);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-481126177) + "'", int18 == (-481126177));
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.multiply((-101), (int) (short) 10);
        int int18 = calculator0.multiply(86713344, 1700666764);
        int int21 = calculator0.multiply((-433567285), 1908264022);
        int int24 = calculator0.multiply((-757113354), (-173436074));
        int int27 = calculator0.add((-865948009), (-403723706));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1010) + "'", int15 == (-1010));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-290738176) + "'", int18 == (-290738176));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2110419406) + "'", int21 == (-2110419406));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1889283420) + "'", int24 == (-1889283420));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1269671715) + "'", int27 == (-1269671715));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((-97), 96);
        int int15 = calculator0.divide((-15300), 1693566793);
        int int18 = calculator0.subtract(37489359, (-1237148864));
        int int21 = calculator0.subtract((-1538240), 346346583);
        int int24 = calculator0.multiply((-284942769), 1271869877);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9312) + "'", int12 == (-9312));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1274638223 + "'", int18 == 1274638223);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-347884823) + "'", int21 == (-347884823));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1855425755 + "'", int24 == 1855425755);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((-3), 86713344);
        int int15 = calculator0.subtract((-520200), (-15));
        int int18 = calculator0.subtract((-2020), 1237148765);
        int int21 = calculator0.add(0, 866523750);
        int int24 = calculator0.subtract((-869367269), 1);
        int int27 = calculator0.add((-1556003554), 765139659);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-520185) + "'", int15 == (-520185));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1237150785) + "'", int18 == (-1237150785));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 866523750 + "'", int21 == 866523750);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-869367270) + "'", int24 == (-869367270));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-790863895) + "'", int27 == (-790863895));
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.subtract(0, 867154019);
        int int15 = calculator0.subtract(867154019, (-976));
        int int18 = calculator0.add((-171620289), 51);
        int int21 = calculator0.add((int) (short) 100, (-1497046880));
        int int24 = calculator0.subtract(1940875760, 765145078);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867154019) + "'", int12 == (-867154019));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867154995 + "'", int15 == 867154995);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-171620238) + "'", int18 == (-171620238));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1497046780) + "'", int21 == (-1497046780));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1175730682 + "'", int24 == 1175730682);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(1219996744, 109415572);
        int int21 = calculator0.divide(1769916224, (-24578));
        int int24 = calculator0.divide(1754530371, (-867133342));
        int int27 = calculator0.multiply((-1341547376), 1572558016);
        int int30 = calculator0.subtract((-1874677642), (-1556003565));
        int int33 = calculator0.multiply(1524237619, (-1587684178));
        int int36 = calculator0.multiply(1237148811, 1154269414);
        java.lang.Class<?> wildcardClass37 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-72012) + "'", int21 == (-72012));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-607867904) + "'", int27 == (-607867904));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-318674077) + "'", int30 == (-318674077));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 321805482 + "'", int33 == 321805482);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1448383714 + "'", int36 == 1448383714);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.add((-76), (-76));
        int int27 = calculator0.multiply((-6858340), 3563280);
        int int30 = calculator0.divide((-37), (-211766202));
        int int33 = calculator0.divide((-13703472), (-178330532));
        java.lang.Class<?> wildcardClass34 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-152) + "'", int24 == (-152));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 178159040 + "'", int27 == 178159040);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.subtract((-7955541), (-867133515));
        int int18 = calculator0.multiply((-341775360), (-109415539));
        int int21 = calculator0.multiply(280533860, (-240317368));
        int int24 = calculator0.add(0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 859177974 + "'", int15 == 859177974);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1985610752) + "'", int18 == (-1985610752));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2117573600) + "'", int21 == (-2117573600));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.multiply((-88956701), 568480);
        int int21 = calculator0.multiply((-341775360), (-2019171204));
        int int24 = calculator0.multiply((-58), (-132));
        int int27 = calculator0.add((-1539251552), 1751544644);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1160441376) + "'", int18 == (-1160441376));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1876799488) + "'", int21 == (-1876799488));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7656 + "'", int24 == 7656);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 212293092 + "'", int27 == 212293092);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(95, 0);
        int int15 = calculator0.multiply((-867138628), (-15200));
        int int18 = calculator0.multiply(100, 34);
        int int21 = calculator0.add(1733781449, 0);
        int int24 = calculator0.subtract((-845157802), (-1951882450));
        int int27 = calculator0.divide((-287587), 7029197);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-747485824) + "'", int15 == (-747485824));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3400 + "'", int18 == 3400);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1733781449 + "'", int21 == 1733781449);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1106724648 + "'", int24 == 1106724648);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.divide((int) 'a', (-207));
        int int21 = calculator0.multiply(0, (-867133440));
        int int24 = calculator0.divide(0, (-442694645));
        int int27 = calculator0.add((-1685150444), 911011581);
        int int30 = calculator0.add(365037960, (-351870447));
        int int33 = calculator0.subtract((-1063144052), (-570687692));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-774138863) + "'", int27 == (-774138863));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 13167513 + "'", int30 == 13167513);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-492456360) + "'", int33 == (-492456360));
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.divide((-173436074), 96);
        int int24 = calculator0.divide((-1806625), (-1559826432));
        int int27 = calculator0.multiply((-867133329), (-86));
        int int30 = calculator0.subtract(258, (-867158093));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1806625) + "'", int21 == (-1806625));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1559022262 + "'", int27 == 1559022262);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 867158351 + "'", int30 == 867158351);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.subtract(1810185236, 1484018126);
        int int15 = calculator0.multiply((-325549817), 395484846);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 326167110 + "'", int12 == 326167110);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 642254018 + "'", int15 == 642254018);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((-866613314), 692692992);
        int int18 = calculator0.add(1693566793, 867154995);
        int int21 = calculator0.multiply(692692, (-1598963920));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1734245508) + "'", int18 == (-1734245508));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 945587136 + "'", int21 == 945587136);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(67686400, (-111));
        int int21 = calculator0.divide((-2093236467), (-2084640));
        int int24 = calculator0.divide(2016961242, (int) (short) -1);
        int int27 = calculator0.multiply(109, (-86713651));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-609787) + "'", int18 == (-609787));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1004 + "'", int21 == 1004);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2016961242) + "'", int24 == (-2016961242));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-861853367) + "'", int27 == (-861853367));
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((-68), (int) (byte) 10);
        int int21 = calculator0.divide(96, (-68));
        int int24 = calculator0.divide((-15300), (-520200));
        int int27 = calculator0.subtract((-8085940), 86144901);
        int int30 = calculator0.divide(430872592, (-322124534));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-94230841) + "'", int27 == (-94230841));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.divide(51, 101);
        int int18 = calculator0.multiply((-902782633), (-7466));
        int int21 = calculator0.divide(210, (-170954984));
        int int24 = calculator0.subtract(1290976504, (-1652908049));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1371450554 + "'", int18 == 1371450554);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1351082743) + "'", int24 == (-1351082743));
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.add((-3528), (-7567));
        int int24 = calculator0.divide((-346346486), (int) (short) 100);
        int int27 = calculator0.add(1520179488, 236472665);
        int int30 = calculator0.subtract((-1688606465), 241122679);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11095) + "'", int21 == (-11095));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3463464) + "'", int24 == (-3463464));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1756652153 + "'", int27 == 1756652153);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1929729144) + "'", int30 == (-1929729144));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.subtract(96, 97);
        int int15 = calculator0.multiply((-45), (-23318356));
        int int18 = calculator0.divide((-1322291616), 25);
        int int21 = calculator0.divide(15, 1323847021);
        int int24 = calculator0.multiply((-1433052896), (-791214257));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-52891664) + "'", int18 == (-52891664));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1822007072) + "'", int24 == (-1822007072));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.subtract(96, 97);
        int int15 = calculator0.multiply((-45), (-23318356));
        int int18 = calculator0.subtract(232346588, (-844637556));
        int int21 = calculator0.divide(1702058646, 959314071);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1076984144 + "'", int18 == 1076984144);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.multiply((int) (short) 10, (-685834));
        int int21 = calculator0.divide((-76), (-3528));
        int int24 = calculator0.multiply(114939, (-417546408));
        int int27 = calculator0.multiply(1448299036, 1429923579);
        int int30 = calculator0.divide((-1539251552), 9552704);
        int int33 = calculator0.multiply((-1333062898), 1058203134);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6858340) + "'", int18 == (-6858340));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-402023608) + "'", int24 == (-402023608));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1902718604) + "'", int27 == (-1902718604));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-161) + "'", int30 == (-161));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1527016932 + "'", int33 == 1527016932);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide(100, 98);
        int int21 = calculator0.multiply((-976), (-1887134100));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-698088384) + "'", int21 == (-698088384));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.subtract((-86713342), 86713455);
        int int21 = calculator0.add(24486762, (-1792435712));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1767948950) + "'", int21 == (-1767948950));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.subtract(0, (-110));
        int int24 = calculator0.divide(213009, (-241122442));
        int int27 = calculator0.add((-1248231612), (-1845536552));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 110 + "'", int21 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1201199132 + "'", int27 == 1201199132);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract(1186673700, (-1597676684));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1510616912) + "'", int15 == (-1510616912));
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.multiply(34, (-685834));
        int int21 = calculator0.subtract((-74870788), 0);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-23318356) + "'", int18 == (-23318356));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-74870788) + "'", int21 == (-74870788));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.subtract((-1), (-97));
        int int21 = calculator0.add((-131), (-867133440));
        int int24 = calculator0.multiply((int) (byte) 0, (-3528));
        int int27 = calculator0.subtract((-86713651), 2233940);
        int int30 = calculator0.subtract((-868095375), (-1364644474));
        int int33 = calculator0.subtract(97, (-1814766297));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-867133571) + "'", int21 == (-867133571));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-88947591) + "'", int27 == (-88947591));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 496549099 + "'", int30 == 496549099);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1814766394 + "'", int33 == 1814766394);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.divide((-36), 33);
        int int18 = calculator0.divide((-207), 33);
        int int21 = calculator0.add(67686400, 861507584);
        int int24 = calculator0.add(0, 0);
        int int27 = calculator0.subtract((-867133571), 1455335579);
        int int30 = calculator0.add(1678282987, (-397900692));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 929193984 + "'", int21 == 929193984);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1972498146 + "'", int27 == 1972498146);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1280382295 + "'", int30 == 1280382295);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply(0, 1810705533);
        int int24 = calculator0.subtract((-341775360), 52);
        int int27 = calculator0.add((-170954984), 1497039730);
        int int30 = calculator0.divide((-708211210), 780440642);
        int int33 = calculator0.add(8704872, 967670054);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-341775412) + "'", int24 == (-341775412));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1326084746 + "'", int27 == 1326084746);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 976374926 + "'", int33 == 976374926);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.divide((-1403241466), 1271882624);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add(1, (-867133440));
        int int18 = calculator0.divide((-101), (-1923));
        int int21 = calculator0.divide(3400, 520201);
        int int24 = calculator0.multiply((-1024181989), 976529318);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133439) + "'", int15 == (-867133439));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1931060354 + "'", int24 == 1931060354);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract(1787380221, 86713457);
        int int18 = calculator0.add((-68), (-2146806784));
        int int21 = calculator0.divide((-1813700023), (-50514530));
        int int24 = calculator0.divide((-1145179180), 4864);
        int int27 = calculator0.multiply(765139659, 34);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2146806852) + "'", int18 == (-2146806852));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-235439) + "'", int24 == (-235439));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 244944630 + "'", int27 == 244944630);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.add((-867133515), 1154271478);
        int int18 = calculator0.divide(452435152, 867148791);
        int int21 = calculator0.multiply((-2045750321), 1271869877);
        int int24 = calculator0.add(1090656050, 178605);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 287137963 + "'", int15 == 287137963);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1391911003 + "'", int21 == 1391911003);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1090834655 + "'", int24 == 1090834655);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(95, 0);
        int int15 = calculator0.multiply((-867138628), (-15200));
        int int18 = calculator0.multiply(100, 34);
        int int21 = calculator0.add((-49173772), (-171620238));
        int int24 = calculator0.divide((-1555994343), (-845157802));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-747485824) + "'", int15 == (-747485824));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3400 + "'", int18 == 3400);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-220794010) + "'", int21 == (-220794010));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((-101), (-86));
        int int15 = calculator0.add((-362406912), (-173426797));
        int int18 = calculator0.multiply(2130112384, (-104699111));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-15) + "'", int12 == (-15));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-535833709) + "'", int15 == (-535833709));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1690836096) + "'", int18 == (-1690836096));
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract((int) (byte) -1, 100);
        int int12 = calculator0.divide(153, 21975629);
        int int15 = calculator0.add(815415403, 236472665);
        int int18 = calculator0.multiply(1357146709, (-214132468));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1051888068 + "'", int15 == 1051888068);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-382875396) + "'", int18 == (-382875396));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.divide(867133667, (int) (byte) 100);
        int int24 = calculator0.divide((-1323268097), (-1617647721));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8671336 + "'", int21 == 8671336);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(95, 0);
        int int15 = calculator0.multiply((-867138628), (-15200));
        int int18 = calculator0.multiply(100, 34);
        int int21 = calculator0.add(1733781449, 0);
        int int24 = calculator0.add(1532796050, 7029297);
        int int27 = calculator0.divide(258400, 1261453047);
        int int30 = calculator0.divide(51, 887396705);
        int int33 = calculator0.multiply(902771538, 1144658859);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-747485824) + "'", int15 == (-747485824));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3400 + "'", int18 == 3400);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1733781449 + "'", int21 == 1733781449);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1539825347 + "'", int24 == 1539825347);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 879029702 + "'", int33 == 879029702);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(2243220, (int) '4');
        int int21 = calculator0.subtract((-902782633), 1678282987);
        int int24 = calculator0.multiply(867133501, (-3528));
        int int27 = calculator0.multiply((-1300680656), 49164297);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 43138 + "'", int18 == 43138);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1713901676 + "'", int21 == 1713901676);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1230276776) + "'", int24 == (-1230276776));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 736866736 + "'", int27 == 736866736);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(2243220, (int) '4');
        int int21 = calculator0.subtract((-1121825728), (-3528));
        int int24 = calculator0.divide(976768125, 309633983);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 43138 + "'", int18 == 43138);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1121822200) + "'", int21 == (-1121822200));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.add((-109415539), (-111));
        int int24 = calculator0.add((-757113551), (-1807123776));
        int int27 = calculator0.subtract(8, (-1));
        int int30 = calculator0.multiply((-3528), (-934840515));
        int int33 = calculator0.multiply(76, 823407538);
        int int36 = calculator0.multiply(1754600977, (-127527494));
        int int39 = calculator0.multiply((-1136615032), (-1057369120));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-109415650) + "'", int21 == (-109415650));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1730729969 + "'", int24 == 1730729969);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-417546408) + "'", int30 == (-417546408));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1845536552) + "'", int33 == (-1845536552));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2045209946 + "'", int36 == 2045209946);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 452488960 + "'", int39 == 452488960);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract(76, (-867133439));
        int int18 = calculator0.subtract((-976), 4213);
        int int21 = calculator0.divide(346346496, (-844637556));
        int int24 = calculator0.multiply(417847584, (-161));
        int int27 = calculator0.add(1616550797, 1772546271);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133515 + "'", int15 == 867133515);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-5189) + "'", int18 == (-5189));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1446015712 + "'", int24 == 1446015712);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-905870228) + "'", int27 == (-905870228));
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.add((-3528), (-7567));
        int int24 = calculator0.divide((-346346486), (int) (short) 100);
        int int27 = calculator0.multiply((-756998415), (-910738153));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11095) + "'", int21 == (-11095));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3463464) + "'", int24 == (-3463464));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-304073561) + "'", int27 == (-304073561));
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.multiply((int) (short) 10, (-685834));
        int int21 = calculator0.subtract(867154019, 1925360681);
        int int24 = calculator0.multiply(100, 0);
        int int27 = calculator0.subtract((-9280), 164584658);
        int int30 = calculator0.add(6596677, (-3020));
        int int33 = calculator0.multiply((-1250435409), (-1923065249));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6858340) + "'", int18 == (-6858340));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1058206662) + "'", int21 == (-1058206662));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-164593938) + "'", int27 == (-164593938));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6593657 + "'", int30 == 6593657);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1617242353 + "'", int33 == 1617242353);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide((-1769916224), (-36));
        int int21 = calculator0.add((-9312), (-121));
        int int24 = calculator0.multiply((int) (short) -1, 0);
        int int27 = calculator0.add(867133546, (int) '#');
        int int30 = calculator0.divide((-1108227320), (-2016961242));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9433) + "'", int21 == (-9433));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 867133581 + "'", int27 == 867133581);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(1145179144, 100);
        int int15 = calculator0.subtract((-932693954), 2110251662);
        int int18 = calculator0.subtract((-376890729), (-866613314));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1145179044 + "'", int12 == 1145179044);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1252021680 + "'", int15 == 1252021680);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 489722585 + "'", int18 == 489722585);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.subtract((-7955541), (-867133515));
        int int18 = calculator0.add((-867051763), (-1567474935));
        int int21 = calculator0.divide((-493712131), 807706469);
        int int24 = calculator0.subtract(9347, 2129948464);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 859177974 + "'", int15 == 859177974);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1860440598 + "'", int18 == 1860440598);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2129939117) + "'", int24 == (-2129939117));
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract((-867154019), 67686496);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-934840515) + "'", int15 == (-934840515));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.divide(30, (-934840515));
        int int21 = calculator0.add(173435032, 1271869877);
        int int24 = calculator0.subtract(109415477, 4213);
        int int27 = calculator0.add((-206361130), 41650243);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1445304909 + "'", int21 == 1445304909);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 109411264 + "'", int24 == 109411264);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-164710887) + "'", int27 == (-164710887));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract(20580, (-867133439));
        int int21 = calculator0.add((-1769916224), (-2243320));
        int int24 = calculator0.multiply((int) (short) -1, 0);
        int int27 = calculator0.subtract(1154271539, 33);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1772159544) + "'", int21 == (-1772159544));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1154271506 + "'", int27 == 1154271506);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.multiply((int) (short) 10, (-685834));
        int int21 = calculator0.subtract(867154019, 1925360681);
        int int24 = calculator0.multiply(100, 0);
        int int27 = calculator0.subtract(227, (-1058206662));
        int int30 = calculator0.divide((-458491822), (-563954720));
        int int33 = calculator0.add(306354380, 0);
        int int36 = calculator0.multiply((-2110419406), (-477385434));
        int int39 = calculator0.subtract((-241101862), 173435032);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6858340) + "'", int18 == (-6858340));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1058206662) + "'", int21 == (-1058206662));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1058206889 + "'", int27 == 1058206889);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 306354380 + "'", int33 == 306354380);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 271639916 + "'", int36 == 271639916);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-414536894) + "'", int39 == (-414536894));
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.multiply((int) (byte) -1, (int) '4');
        int int24 = calculator0.multiply((-867133439), (-68));
        int int27 = calculator0.subtract((-58), (-1497046780));
        int int30 = calculator0.multiply(2233940, 1754528448);
        int int33 = calculator0.multiply((-791214257), 1538006111);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-52) + "'", int21 == (-52));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1164468292) + "'", int24 == (-1164468292));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1497046722 + "'", int27 == 1497046722);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1436206848 + "'", int30 == 1436206848);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 44849745 + "'", int33 == 44849745);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.subtract(2, 86713344);
        int int18 = calculator0.multiply((-1248231612), 1457636377);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713342) + "'", int15 == (-86713342));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-198083164) + "'", int18 == (-198083164));
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.multiply(1474273060, (-867133566));
        int int15 = calculator0.divide(0, 178159040);
        int int18 = calculator0.subtract((-214452976), (-1951884651));
        int int21 = calculator0.add((-1160010088), 815031976);
        int int24 = calculator0.add(791462977, (-513259903));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-240317368) + "'", int12 == (-240317368));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1737431675 + "'", int18 == 1737431675);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-344978112) + "'", int21 == (-344978112));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 278203074 + "'", int24 == 278203074);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.subtract((-86713342), 86713455);
        int int21 = calculator0.add((-173426914), 1734308238);
        int int24 = calculator0.divide((-867138628), 98);
        int int27 = calculator0.divide(568480, (-636451253));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1560881324 + "'", int21 == 1560881324);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-8848353) + "'", int24 == (-8848353));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract((int) (byte) -1, 100);
        int int12 = calculator0.add((-9433), (-341775360));
        int int15 = calculator0.multiply(131, (-609789));
        int int18 = calculator0.subtract(1154271574, 35);
        int int21 = calculator0.divide(109413727, (-1819445740));
        int int24 = calculator0.subtract(351791, (-1146310354));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-341784793) + "'", int12 == (-341784793));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-79882359) + "'", int15 == (-79882359));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1154271539 + "'", int18 == 1154271539);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1146662145 + "'", int24 == 1146662145);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.multiply((-9312), (-9312));
        int int15 = calculator0.subtract(867133515, (-6));
        int int18 = calculator0.add(867153943, (-1700666664));
        int int21 = calculator0.subtract(867133521, 1724755534);
        int int24 = calculator0.add(0, 9277);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713344 + "'", int12 == 86713344);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133521 + "'", int15 == 867133521);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-833512721) + "'", int18 == (-833512721));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-857622013) + "'", int21 == (-857622013));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9277 + "'", int24 == 9277);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.subtract((-86), (-109415563));
        int int15 = calculator0.add(2139980843, (-901948644));
        int int18 = calculator0.subtract(0, 1769916123);
        int int21 = calculator0.divide(261950040, 1013244357);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 109415477 + "'", int12 == 109415477);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1238032199 + "'", int15 == 1238032199);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1769916123) + "'", int18 == (-1769916123));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.add(867133667, (-121));
        int int21 = calculator0.subtract(0, (-1908264058));
        int int24 = calculator0.multiply((-685834), (-78));
        int int27 = calculator0.multiply(502657300, (-380871040));
        int int30 = calculator0.divide((-382875396), (-1772730154));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133546 + "'", int18 == 867133546);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1908264058 + "'", int21 == 1908264058);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53495052 + "'", int24 == 53495052);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 258859520 + "'", int27 == 258859520);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.multiply((int) (short) 10, (-685834));
        int int21 = calculator0.divide((-76), (-3528));
        int int24 = calculator0.multiply(114939, (-417546408));
        int int27 = calculator0.multiply(1448299036, 1429923579);
        int int30 = calculator0.divide((-1539251552), 9552704);
        int int33 = calculator0.subtract(1007395645, (-1115015376));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6858340) + "'", int18 == (-6858340));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-402023608) + "'", int24 == (-402023608));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1902718604) + "'", int27 == (-1902718604));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-161) + "'", int30 == (-161));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2122411021 + "'", int33 == 2122411021);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.multiply(37489359, 0);
        int int12 = calculator0.subtract(0, (-2033296844));
        int int15 = calculator0.add(109415572, (-956095305));
        int int18 = calculator0.add((-1475697516), (-1269671715));
        int int21 = calculator0.add((-211766202), 1520179488);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2033296844 + "'", int12 == 2033296844);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-846679733) + "'", int15 == (-846679733));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1549598065 + "'", int18 == 1549598065);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1308413286 + "'", int21 == 1308413286);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide(692692992, 2);
        int int21 = calculator0.divide(1237148864, (-1));
        int int24 = calculator0.divide(501219328, 754840506);
        int int27 = calculator0.add(0, (-867138628));
        int int30 = calculator0.subtract((-141800855), 447081480);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 346346496 + "'", int18 == 346346496);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1237148864) + "'", int21 == (-1237148864));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-867138628) + "'", int27 == (-867138628));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-588882335) + "'", int30 == (-588882335));
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add(101, (-2020));
        int int12 = calculator0.subtract(0, (-11868326));
        int int15 = calculator0.multiply((-76), 718097088);
        int int18 = calculator0.divide(34, 867135459);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1919) + "'", int9 == (-1919));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11868326 + "'", int12 == 11868326);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1259196160 + "'", int15 == 1259196160);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract((int) (byte) -1, 100);
        int int12 = calculator0.divide(153, 21975629);
        int int15 = calculator0.add(815415403, 236472665);
        int int18 = calculator0.divide(0, 1512046592);
        int int21 = calculator0.multiply(1532796050, 1076983947);
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1051888068 + "'", int15 == 1051888068);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2090824518 + "'", int21 == 2090824518);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (short) -1, 867133491);
        int int12 = calculator0.multiply((-111), (-3528));
        int int15 = calculator0.add((-36), 1908264058);
        int int18 = calculator0.divide(1897078486, 86605184);
        int int21 = calculator0.add(51, (-13365));
        int int24 = calculator0.multiply(0, (-2125062739));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133491) + "'", int9 == (-867133491));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 391608 + "'", int12 == 391608);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1908264022 + "'", int15 == 1908264022);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 21 + "'", int18 == 21);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-13314) + "'", int21 == (-13314));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.subtract(1271882624, 3400);
        int int24 = calculator0.add(287137963, 1);
        int int27 = calculator0.multiply((-49173772), (-171620238));
        int int30 = calculator0.add((int) (byte) 100, 1307876110);
        int int33 = calculator0.subtract(41650243, (-26730));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 287137964 + "'", int24 == 287137964);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1145651032) + "'", int27 == (-1145651032));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1307876210 + "'", int30 == 1307876210);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 41676973 + "'", int33 == 41676973);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide(100, 98);
        int int21 = calculator0.subtract((-86713551), (int) (short) 100);
        int int24 = calculator0.add((-214132468), (-1526379269));
        int int27 = calculator0.subtract((-708211210), 75792384);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86713651) + "'", int21 == (-86713651));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1740511737) + "'", int24 == (-1740511737));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-784003594) + "'", int27 == (-784003594));
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide((-867133571), (-7600));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 114096 + "'", int18 == 114096);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        int int21 = calculator0.divide(101, (-101));
        int int24 = calculator0.add(1810185236, (int) (byte) 1);
        int int27 = calculator0.multiply((-2146806804), 1408199649);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1810185237 + "'", int24 == 1810185237);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1216649620) + "'", int27 == (-1216649620));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract(1787380221, 86713457);
        int int18 = calculator0.multiply(8671336, (-1481140680));
        int int21 = calculator0.multiply(178159040, (int) (byte) 0);
        int int24 = calculator0.divide(406425903, (-866613314));
        int int27 = calculator0.multiply(1944410221, (-761355104));
        int int30 = calculator0.subtract((-1408776206), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-161052992) + "'", int18 == (-161052992));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1497569312 + "'", int27 == 1497569312);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1408776206) + "'", int30 == (-1408776206));
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(2243220, (int) '4');
        int int21 = calculator0.add((-1154271480), 1237148811);
        int int24 = calculator0.divide(1427407016, 173435032);
        int int27 = calculator0.subtract(1145179044, (-29145099));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 43138 + "'", int18 == 43138);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 82877331 + "'", int21 == 82877331);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1174324143 + "'", int27 == 1174324143);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((-866613314), 692692992);
        int int18 = calculator0.add((int) (short) -1, (-111));
        int int21 = calculator0.subtract(1269639304, (-1555994343));
        int int24 = calculator0.subtract(1152037538, 20580);
        int int27 = calculator0.subtract(867154995, 1237148765);
        int int30 = calculator0.multiply((-576693300), 2064);
        int int33 = calculator0.subtract((-1448314236), 42260132);
        int int36 = calculator0.subtract((-1357816827), 548010);
        java.lang.Class<?> wildcardClass37 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-112) + "'", int18 == (-112));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1469333649) + "'", int21 == (-1469333649));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1152016958 + "'", int24 == 1152016958);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-369993770) + "'", int27 == (-369993770));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-589030208) + "'", int30 == (-589030208));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1490574368) + "'", int33 == (-1490574368));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1358364837) + "'", int36 == (-1358364837));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.subtract((-867133440), 692692992);
        int int21 = calculator0.add(1769916224, (-101));
        int int24 = calculator0.multiply(2033296844, (-7600));
        int int27 = calculator0.divide((-74870788), 2146806474);
        int int30 = calculator0.divide(178605, 1517596387);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1559826432) + "'", int18 == (-1559826432));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1769916123 + "'", int21 == 1769916123);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 236316608 + "'", int24 == 236316608);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.divide((-220), (int) '#');
        int int24 = calculator0.divide(6992, (-68));
        int int27 = calculator0.divide(743025313, 867133509);
        int int30 = calculator0.subtract((-868095375), 131);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-102) + "'", int24 == (-102));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-868095506) + "'", int30 == (-868095506));
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.divide(25, (-1923));
        int int12 = calculator0.multiply((-15300), 34);
        int int15 = calculator0.subtract(1252021680, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-520200) + "'", int12 == (-520200));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1252021680 + "'", int15 == 1252021680);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply((-76), (int) (short) -1);
        int int18 = calculator0.multiply(20580, (-49164339));
        int int21 = calculator0.multiply((-576693300), (int) (short) 1);
        int int24 = calculator0.divide((-382875265), (-1555994343));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 76 + "'", int15 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1810185236 + "'", int18 == 1810185236);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-576693300) + "'", int21 == (-576693300));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(1145179144, 100);
        int int15 = calculator0.multiply((-2146806784), 287137963);
        int int18 = calculator0.add((-1772159544), (-241122442));
        int int21 = calculator0.multiply(1978473568, 1756652153);
        int int24 = calculator0.add((-1152038506), 1944410221);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1145179044 + "'", int12 == 1145179044);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-362406912) + "'", int15 == (-362406912));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2013281986) + "'", int18 == (-2013281986));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1970219360 + "'", int21 == 1970219360);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 792371715 + "'", int24 == 792371715);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract(1925360681, 1672101496);
        int int12 = calculator0.add((-197121368), 940146681);
        int int15 = calculator0.multiply(49164439, 1371450554);
        int int18 = calculator0.subtract((-4967), 2015073664);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 253259185 + "'", int9 == 253259185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 743025313 + "'", int12 == 743025313);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13025718 + "'", int15 == 13025718);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2015078631) + "'", int18 == (-2015078631));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.add(86713457, (-15300));
        int int21 = calculator0.subtract((-13365), 1271882624);
        int int24 = calculator0.divide(351791, (-34682070));
        int int27 = calculator0.multiply((-376890729), 232346435);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86698157 + "'", int18 == 86698157);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1271895989) + "'", int21 == (-1271895989));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-947918203) + "'", int27 == (-947918203));
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide((-1769916224), (-36));
        int int21 = calculator0.add((-9312), (-121));
        int int24 = calculator0.multiply((int) (short) -1, 0);
        int int27 = calculator0.multiply((-917640454), 0);
        int int30 = calculator0.divide((-685328092), (-202366966));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9433) + "'", int21 == (-9433));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-68), 110);
        int int18 = calculator0.add((-86), (-867133440));
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-867133526) + "'", int18 == (-867133526));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.divide((-100), 32);
        int int21 = calculator0.subtract(520297, 51);
        int int24 = calculator0.multiply(757944224, 568590);
        int int27 = calculator0.multiply((-350777344), 0);
        int int30 = calculator0.divide(1252021680, 7010);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 520246 + "'", int21 == 520246);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1807123776) + "'", int24 == (-1807123776));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 178605 + "'", int30 == 178605);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((-101), (-86));
        int int15 = calculator0.add((-362406912), (-173426797));
        int int18 = calculator0.subtract(2129948464, 1730079900);
        int int21 = calculator0.add((-18090313), (-917629359));
        int int24 = calculator0.subtract((-1850343988), (-828646945));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-15) + "'", int12 == (-15));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-535833709) + "'", int15 == (-535833709));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 399868564 + "'", int18 == 399868564);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-935719672) + "'", int21 == (-935719672));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1021697043) + "'", int24 == (-1021697043));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(67686400, (-111));
        int int21 = calculator0.multiply(2110251662, 153);
        int int24 = calculator0.multiply(870696823, 1497046722);
        int int27 = calculator0.multiply(1700666764, 1632827392);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-609787) + "'", int18 == (-609787));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 745957086 + "'", int21 == 745957086);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1729226194) + "'", int24 == (-1729226194));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1351114752) + "'", int27 == (-1351114752));
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply(0, 1810705533);
        int int24 = calculator0.subtract((-341775360), 52);
        int int27 = calculator0.add((-170954984), 1497039730);
        int int30 = calculator0.divide((-636451253), (-976617459));
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-341775412) + "'", int24 == (-341775412));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1326084746 + "'", int27 == 1326084746);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply(0, 0);
        int int18 = calculator0.divide(19670, (-76));
        int int21 = calculator0.subtract((int) (short) -1, 1925360681);
        int int24 = calculator0.subtract(2877446, 0);
        int int27 = calculator0.add(381800633, 1075835744);
        int int30 = calculator0.subtract((-6), 1152037331);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-258) + "'", int18 == (-258));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1925360682) + "'", int21 == (-1925360682));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2877446 + "'", int24 == 2877446);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1457636377 + "'", int27 == 1457636377);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1152037337) + "'", int30 == (-1152037337));
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(10107303, (-1769916224));
        int int21 = calculator0.multiply(1671908248, (-1160441376));
        int int24 = calculator0.subtract((-214452976), 277224907);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1545650944) + "'", int21 == (-1545650944));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-491677883) + "'", int24 == (-491677883));
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.multiply(867133511, (-7955431));
        int int15 = calculator0.divide(1754528448, 1152037536);
        int int18 = calculator0.multiply(2110251662, (-1341547376));
        int int21 = calculator0.add((-610064315), (-467290489));
        int int24 = calculator0.subtract(1597614332, (-841742365));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1037464303 + "'", int12 == 1037464303);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 628881376 + "'", int18 == 628881376);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1077354804) + "'", int21 == (-1077354804));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1855610599) + "'", int24 == (-1855610599));
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.multiply(37489359, 0);
        int int12 = calculator0.subtract(0, (-2033296844));
        int int15 = calculator0.add(109415572, (-956095305));
        int int18 = calculator0.add((-1475697516), (-1269671715));
        int int21 = calculator0.add((-211766202), 1520179488);
        int int24 = calculator0.divide(937240470, (-688528736));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2033296844 + "'", int12 == 2033296844);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-846679733) + "'", int15 == (-846679733));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1549598065 + "'", int18 == 1549598065);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1308413286 + "'", int21 == 1308413286);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.subtract((-111), (-111));
        int int24 = calculator0.divide(1769916224, (-1382667017));
        int int27 = calculator0.subtract(799164324, 2101335786);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1302171462) + "'", int27 == (-1302171462));
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.divide(30, (-934840515));
        int int21 = calculator0.add(173435032, 1271869877);
        int int24 = calculator0.subtract(109415477, 4213);
        int int27 = calculator0.divide((-322124534), 1495828402);
        int int30 = calculator0.divide((-729128684), (-1459544222));
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1445304909 + "'", int21 == 1445304909);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 109411264 + "'", int24 == 109411264);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((-290), (-1887134100));
        int int21 = calculator0.subtract((-2051022112), 954669693);
        int int24 = calculator0.divide(1356945246, 949005184);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1887133810 + "'", int18 == 1887133810);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1289275491 + "'", int21 == 1289275491);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract((int) (byte) -1, 100);
        int int12 = calculator0.add((-9433), (-341775360));
        int int15 = calculator0.multiply(131, (-609789));
        int int18 = calculator0.subtract(1154271574, 35);
        int int21 = calculator0.multiply((-207), 1367258876);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-341784793) + "'", int12 == (-341784793));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-79882359) + "'", int15 == (-79882359));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1154271539 + "'", int18 == 1154271539);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 445254204 + "'", int21 == 445254204);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.subtract(0, (-110));
        int int24 = calculator0.divide((int) (byte) -1, 867133667);
        int int27 = calculator0.divide(178605, 1671908248);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 110 + "'", int21 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.multiply((-1923), 2115365205);
        int int12 = calculator0.divide(1269639246, (-433567285));
        int int15 = calculator0.add((-141800855), 1137);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-513259903) + "'", int9 == (-513259903));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-141799718) + "'", int15 == (-141799718));
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.subtract(100, (-1));
        int int21 = calculator0.multiply((-5), 378379962);
        int int24 = calculator0.add(1520179488, (-1494342816));
        int int27 = calculator0.subtract(870696771, 638350336);
        int int30 = calculator0.add(1769916224, 1591253037);
        int int33 = calculator0.divide((-866523730), (-609789));
        int int36 = calculator0.divide((-1486954551), (-493712131));
        java.lang.Class<?> wildcardClass37 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1891899810) + "'", int21 == (-1891899810));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 25836672 + "'", int24 == 25836672);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 232346435 + "'", int27 == 232346435);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-933798035) + "'", int30 == (-933798035));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1421 + "'", int33 == 1421);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.subtract((-1), 9);
        int int18 = calculator0.subtract((-2243320), 86713381);
        int int21 = calculator0.add(1145651162, (-917629359));
        int int24 = calculator0.multiply((-2125598352), 4213);
        int int27 = calculator0.add((-1769916224), (-1355343336));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-88956701) + "'", int18 == (-88956701));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 228021803 + "'", int21 == 228021803);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-139044816) + "'", int24 == (-139044816));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1169707736 + "'", int27 == 1169707736);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.add(0, 10);
        int int18 = calculator0.subtract((int) (short) 0, 110);
        int int21 = calculator0.multiply((-867133491), (-9280));
        int int24 = calculator0.multiply(98, 210);
        int int27 = calculator0.divide((-1902718604), (-1688606465));
        int int30 = calculator0.divide(178159040, (-1262943204));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-110) + "'", int18 == (-110));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1769916224) + "'", int21 == (-1769916224));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20580 + "'", int24 == 20580);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract(20580, (-867133439));
        int int21 = calculator0.divide((-609787), (-31));
        int int24 = calculator0.multiply((-50514530), (-867133666));
        int int27 = calculator0.divide(1323847021, (-23318356));
        int int30 = calculator0.add((-132), 757717952);
        int int33 = calculator0.subtract((-845157802), 7955592);
        int int36 = calculator0.add(867133667, 1258058047);
        int int39 = calculator0.multiply(1935, 827319272);
        int int42 = calculator0.subtract(287137963, (-1171728053));
        int int45 = calculator0.add(0, (-1119880367));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19670 + "'", int21 == 19670);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1448314236) + "'", int24 == (-1448314236));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-56) + "'", int27 == (-56));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 757717820 + "'", int30 == 757717820);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-853113394) + "'", int33 == (-853113394));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2125191714 + "'", int36 == 2125191714);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1160010088) + "'", int39 == (-1160010088));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1458866016 + "'", int42 == 1458866016);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1119880367) + "'", int45 == (-1119880367));
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.divide(95, (int) (byte) 10);
        int int27 = calculator0.subtract((-6867620), 1013244259);
        int int30 = calculator0.add((-131), (int) (byte) 100);
        int int33 = calculator0.multiply(520297, (-178319437));
        int int36 = calculator0.add((-164656960), 1900738760);
        int int39 = calculator0.subtract(867133616, (-86713551));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1020111879) + "'", int27 == (-1020111879));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-31) + "'", int30 == (-31));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 815415403 + "'", int33 == 815415403);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1736081800 + "'", int36 == 1736081800);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 953847167 + "'", int39 == 953847167);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide((-1769916224), (-36));
        int int21 = calculator0.add((-9312), (-121));
        int int24 = calculator0.multiply((int) (short) -1, 0);
        int int27 = calculator0.subtract(42927, 346346496);
        int int30 = calculator0.divide(0, 1493382152);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9433) + "'", int21 == (-9433));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-346303569) + "'", int27 == (-346303569));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.divide((-100), 32);
        int int21 = calculator0.multiply((int) (byte) -1, (-8));
        int int24 = calculator0.subtract(32, 520052);
        int int27 = calculator0.divide((-1475970418), 1978473568);
        int int30 = calculator0.subtract((-1803015996), (-588882335));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-520020) + "'", int24 == (-520020));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1214133661) + "'", int30 == (-1214133661));
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.divide(30, (-934840515));
        int int21 = calculator0.add(173435032, 1271869877);
        int int24 = calculator0.subtract(109415477, 4213);
        int int27 = calculator0.subtract((-341784793), (-1293640847));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1445304909 + "'", int21 == 1445304909);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 109411264 + "'", int24 == 109411264);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 951856054 + "'", int27 == 951856054);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.multiply((-96348159), (-9280));
        int int15 = calculator0.divide((-5), 202);
        int int18 = calculator0.divide(110, 853334016);
        int int21 = calculator0.subtract(42927, (-72012));
        int int24 = calculator0.add((-1380354224), 1935);
        int int27 = calculator0.divide((-826840308), (-38255));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 757717952 + "'", int12 == 757717952);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 114939 + "'", int21 == 114939);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1380352289) + "'", int24 == (-1380352289));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 21613 + "'", int27 == 21613);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.subtract((-1), (-97));
        int int21 = calculator0.add((-131), (-867133440));
        int int24 = calculator0.multiply((int) (byte) 0, (-3528));
        int int27 = calculator0.subtract((-86713651), 2233940);
        int int30 = calculator0.add(258400, (-1816189210));
        int int33 = calculator0.subtract(1968289463, (-1299086161));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-867133571) + "'", int21 == (-867133571));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-88947591) + "'", int27 == (-88947591));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1815930810) + "'", int30 == (-1815930810));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1027591672) + "'", int33 == (-1027591672));
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.multiply((int) (byte) 100, (-1));
        int int12 = calculator0.multiply((-1), (-2020));
        int int15 = calculator0.add(10, (-164358480));
        int int18 = calculator0.multiply((-293627777), (-1336575288));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2020 + "'", int12 == 2020);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-164358470) + "'", int15 == (-164358470));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 344369464 + "'", int18 == 344369464);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.subtract(96, 97);
        int int15 = calculator0.multiply((-45), (-23318356));
        int int18 = calculator0.divide((-1322291616), 25);
        int int21 = calculator0.divide(15, 1323847021);
        int int24 = calculator0.multiply((-1433052896), (-791214257));
        int int27 = calculator0.multiply(0, 428644672);
        int int30 = calculator0.add((-1917940425), 1307876110);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-52891664) + "'", int18 == (-52891664));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1822007072) + "'", int24 == (-1822007072));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-610064315) + "'", int30 == (-610064315));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((-110), (-68));
        int int9 = calculator0.add(6992, 1152037538);
        int int12 = calculator0.divide((-1887134100), (-96348159));
        int int15 = calculator0.divide((-761355104), 1519650529);
        int int18 = calculator0.add(1013244357, (-41150040));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1152044530 + "'", int9 == 1152044530);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 972094317 + "'", int18 == 972094317);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(2243220, (int) '4');
        int int21 = calculator0.subtract((-902782633), 1678282987);
        int int24 = calculator0.multiply(867133501, (-3528));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 43138 + "'", int18 == 43138);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1713901676 + "'", int21 == 1713901676);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1230276776) + "'", int24 == (-1230276776));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((int) '#', (int) (short) -1);
        int int21 = calculator0.subtract((int) (short) 0, (-1769916224));
        int int24 = calculator0.multiply((-2146806852), 665);
        int int27 = calculator0.multiply((-68), 791316392);
        int int30 = calculator0.add((-24578), (-563930142));
        int int33 = calculator0.divide(1812946030, (-1891899810));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1769916224 + "'", int21 == 1769916224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1697414308) + "'", int24 == (-1697414308));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2025060192 + "'", int27 == 2025060192);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-563954720) + "'", int30 == (-563954720));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract((-867154019), 67686496);
        int int18 = calculator0.add((-214452976), (-1838369148));
        int int21 = calculator0.add(568590, 0);
        int int24 = calculator0.divide((-88947591), (-2033296844));
        int int27 = calculator0.subtract(1271879224, (-947918203));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-934840515) + "'", int15 == (-934840515));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2052822124) + "'", int18 == (-2052822124));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 568590 + "'", int21 == 568590);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2075169869) + "'", int27 == (-2075169869));
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 100, (int) (short) 10);
        int int12 = calculator0.multiply(9, (int) (short) 1);
        int int15 = calculator0.subtract((-7955541), (-867133515));
        int int18 = calculator0.divide(1252021680, 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 110 + "'", int9 == 110);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 859177974 + "'", int15 == 859177974);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12396254 + "'", int18 == 12396254);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.divide((-867133439), 9);
        int int12 = calculator0.subtract(0, 867154019);
        int int15 = calculator0.subtract(867154019, (-976));
        int int18 = calculator0.add((-171620289), 51);
        int int21 = calculator0.divide(1269639304, (-1769916127));
        int int24 = calculator0.subtract(86698157, (-1237148864));
        int int27 = calculator0.subtract(1580921300, (-3));
        int int30 = calculator0.divide((-887), (-917640454));
        int int33 = calculator0.multiply((-1145651032), 1606894920);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-96348159) + "'", int9 == (-96348159));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867154019) + "'", int12 == (-867154019));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867154995 + "'", int15 == 867154995);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-171620238) + "'", int18 == (-171620238));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1323847021 + "'", int24 == 1323847021);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1580921303 + "'", int27 == 1580921303);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 669742912 + "'", int33 == 669742912);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.subtract((-86713342), 86713455);
        int int21 = calculator0.subtract((-1494342816), 1787380221);
        int int24 = calculator0.divide(1754530371, (-10));
        int int27 = calculator0.divide((-1984131052), (-1816189210));
        int int30 = calculator0.multiply(4864, (-23207515));
        int int33 = calculator0.add(1189271234, 1058206889);
        java.lang.Class<?> wildcardClass34 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173426797) + "'", int18 == (-173426797));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1013244259 + "'", int21 == 1013244259);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-175453037) + "'", int24 == (-175453037));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1212203264) + "'", int30 == (-1212203264));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2047489173) + "'", int33 == (-2047489173));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((int) '#', (int) ' ');
        int int18 = calculator0.add(34, (-1010));
        int int21 = calculator0.add((-1247137119), (-1951882450));
        int int24 = calculator0.add((-920261842), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-976) + "'", int18 == (-976));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1095947727 + "'", int21 == 1095947727);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-920261842) + "'", int24 == (-920261842));
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.add(867133667, (-121));
        int int21 = calculator0.subtract(0, (-1908264058));
        int int24 = calculator0.multiply((-685834), (-78));
        int int27 = calculator0.subtract((-1237148864), (-1819445740));
        int int30 = calculator0.multiply(675399327, 1908264058);
        int int33 = calculator0.divide((-867141020), 48170496);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133546 + "'", int18 == 867133546);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1908264058 + "'", int21 == 1908264058);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53495052 + "'", int24 == 53495052);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 582296876 + "'", int27 == 582296876);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1812093894 + "'", int30 == 1812093894);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-18) + "'", int33 == (-18));
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.multiply((-1923), 2115365205);
        int int12 = calculator0.divide((-2453011), (-822768));
        int int15 = calculator0.add(346346496, 1751623880);
        int int18 = calculator0.divide(60635266, (-858032));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-513259903) + "'", int9 == (-513259903));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2097970376 + "'", int15 == 2097970376);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-70) + "'", int18 == (-70));
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(1145179144, 100);
        int int15 = calculator0.subtract(1237148811, (-240317368));
        int int18 = calculator0.add((-173436042), 1848991744);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1145179044 + "'", int12 == 1145179044);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1477466179 + "'", int15 == 1477466179);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1675555702 + "'", int18 == 1675555702);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply((-76), (-7480));
        int int9 = calculator0.add((-1951649816), 1754528448);
        int int12 = calculator0.divide(21975629, 1429824755);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 568480 + "'", int6 == 568480);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-197121368) + "'", int9 == (-197121368));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract(20580, (-867133439));
        int int21 = calculator0.divide((-609787), (-31));
        int int24 = calculator0.multiply((-50514530), (-867133666));
        int int27 = calculator0.divide(1323847021, (-23318356));
        int int30 = calculator0.add((-132), 757717952);
        int int33 = calculator0.subtract((-845157802), 7955592);
        java.lang.Class<?> wildcardClass34 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19670 + "'", int21 == 19670);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1448314236) + "'", int24 == (-1448314236));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-56) + "'", int27 == (-56));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 757717820 + "'", int30 == 757717820);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-853113394) + "'", int33 == (-853113394));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((-68), (int) (byte) 10);
        int int21 = calculator0.divide(96, (-68));
        int int24 = calculator0.divide((-15300), (-520200));
        int int27 = calculator0.add((-171620289), 665305);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = calculator0.divide(1923, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-170954984) + "'", int27 == (-170954984));
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract((int) (byte) -1, 100);
        int int12 = calculator0.divide(153, 21975629);
        int int15 = calculator0.add(815415403, 236472665);
        int int18 = calculator0.multiply(850335808, (-68));
        int int21 = calculator0.subtract(618458674, 947747342);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1051888068 + "'", int15 == 1051888068);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1988260096) + "'", int18 == (-1988260096));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-329288668) + "'", int21 == (-329288668));
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.divide(86713475, (-1897778925));
        int int21 = calculator0.multiply(324289668, (-1539251552));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 707222144 + "'", int21 == 707222144);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.subtract(20580, (-867133439));
        int int21 = calculator0.divide((-609787), (-31));
        int int24 = calculator0.multiply((-50514530), (-867133666));
        int int27 = calculator0.divide(1323847021, (-23318356));
        int int30 = calculator0.add((-132), 757717952);
        int int33 = calculator0.subtract((-845157802), 7955592);
        int int36 = calculator0.add(867133667, 1258058047);
        int int39 = calculator0.add((-799325632), 241122652);
        int int42 = calculator0.divide((-617839864), (-344187052));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867154019 + "'", int18 == 867154019);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19670 + "'", int21 == 19670);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1448314236) + "'", int24 == (-1448314236));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-56) + "'", int27 == (-56));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 757717820 + "'", int30 == 757717820);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-853113394) + "'", int33 == (-853113394));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2125191714 + "'", int36 == 2125191714);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-558202980) + "'", int39 == (-558202980));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.multiply((-101), (int) (short) 10);
        int int18 = calculator0.divide((int) 'a', 196);
        int int21 = calculator0.divide((-1872319616), 164584658);
        int int24 = calculator0.multiply(49164339, 2033296844);
        int int27 = calculator0.subtract((-451867), 13432946);
        int int30 = calculator0.subtract(868979689, 376883077);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1010) + "'", int15 == (-1010));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11) + "'", int21 == (-11));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 799164324 + "'", int24 == 799164324);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-13884813) + "'", int27 == (-13884813));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 492096612 + "'", int30 == 492096612);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.add(1152037484, (int) '4');
        int int15 = calculator0.subtract((-173426914), (-1806625));
        int int18 = calculator0.add((-1810467552), (-1057369120));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1152037536 + "'", int12 == 1152037536);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-171620289) + "'", int15 == (-171620289));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1427130624 + "'", int18 == 1427130624);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.add((int) (byte) 1, (int) ' ');
        int int15 = calculator0.subtract(754840506, (-1984132447));
        int int18 = calculator0.multiply(1, 94);
        int int21 = calculator0.multiply(1371450554, 2130112384);
        int int24 = calculator0.subtract(1014215205, 1322286197);
        int int27 = calculator0.add((-1593893682), 232346588);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1555994343) + "'", int15 == (-1555994343));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 94 + "'", int18 == 94);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1767113472 + "'", int21 == 1767113472);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-308070992) + "'", int24 == (-308070992));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1361547094) + "'", int27 == (-1361547094));
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.subtract(0, 1322291616);
        int int18 = calculator0.add((-665227), 2085965638);
        int int21 = calculator0.divide((-1730079900), (-3459));
        int int24 = calculator0.subtract((-867133515), (-223539911));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1322291616) + "'", int15 == (-1322291616));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2085300411 + "'", int18 == 2085300411);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 500167 + "'", int21 == 500167);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-643593604) + "'", int24 == (-643593604));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.divide((-220), (int) '#');
        int int24 = calculator0.divide(6992, (-68));
        int int27 = calculator0.multiply((-844637556), 1237148811);
        int int30 = calculator0.divide((-1369258035), 8939518);
        int int33 = calculator0.divide(1261453047, 1237148765);
        int int36 = calculator0.subtract(1810185236, (-50514530));
        int int39 = calculator0.multiply(225762276, 1923);
        int int42 = calculator0.subtract((-1258774038), (-6858340));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-102) + "'", int24 == (-102));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2132911612) + "'", int27 == (-2132911612));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-153) + "'", int30 == (-153));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1860699766 + "'", int36 == 1860699766);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 349159852 + "'", int39 == 349159852);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1251915698) + "'", int42 == (-1251915698));
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.multiply(284903989, 21975629);
        int int15 = calculator0.add(867133546, (-308070992));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1263186959) + "'", int12 == (-1263186959));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 559062554 + "'", int15 == 559062554);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply(0, 0);
        int int18 = calculator0.multiply(867133667, (-97));
        int int21 = calculator0.subtract((-173426797), 9277);
        int int24 = calculator0.subtract((-112879003), 1810186246);
        int int27 = calculator0.add(15, 1269639304);
        int int30 = calculator0.add(0, (-907339462));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1787380221 + "'", int18 == 1787380221);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173436074) + "'", int21 == (-173436074));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1923065249) + "'", int24 == (-1923065249));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1269639319 + "'", int27 == 1269639319);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-907339462) + "'", int30 == (-907339462));
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply(0, 0);
        int int18 = calculator0.multiply(867133667, (-97));
        int int21 = calculator0.subtract((-173426797), 9277);
        int int24 = calculator0.subtract((-112879003), 1810186246);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1787380221 + "'", int18 == 1787380221);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-173436074) + "'", int21 == (-173436074));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1923065249) + "'", int24 == (-1923065249));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.subtract((-1), (-97));
        int int21 = calculator0.add((-97), 98);
        int int24 = calculator0.divide(178159040, (-867158093));
        int int27 = calculator0.divide((-152), (-45247));
        int int30 = calculator0.multiply(1527277189, 867150782);
        int int33 = calculator0.subtract((-952250499), 243351333);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1063129674) + "'", int30 == (-1063129674));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1195601832) + "'", int33 == (-1195601832));
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.multiply(867133511, (-7955431));
        int int15 = calculator0.subtract((-1638373376), 2025060192);
        int int18 = calculator0.add((-1380352289), 104749);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1037464303 + "'", int12 == 1037464303);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 631533728 + "'", int15 == 631533728);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1380247540) + "'", int18 == (-1380247540));
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.add((-3528), (-7567));
        int int24 = calculator0.divide((-346346486), (int) (short) 100);
        int int27 = calculator0.add((int) (short) 0, (-757113551));
        int int30 = calculator0.divide((-567), 1145179044);
        int int33 = calculator0.subtract(0, 440742595);
        int int36 = calculator0.subtract((-1690836096), 945587136);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11095) + "'", int21 == (-11095));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3463464) + "'", int24 == (-3463464));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-757113551) + "'", int27 == (-757113551));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-440742595) + "'", int33 == (-440742595));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1658544064 + "'", int36 == 1658544064);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.divide(95, (int) (byte) 10);
        int int27 = calculator0.subtract((-6867620), 1013244259);
        int int30 = calculator0.add((-131), (int) (byte) 100);
        int int33 = calculator0.multiply(520297, (-178319437));
        int int36 = calculator0.divide(1510267836, 867150782);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1020111879) + "'", int27 == (-1020111879));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-31) + "'", int30 == (-31));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 815415403 + "'", int33 == 815415403);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply(0, (-867133537));
        int int9 = calculator0.add((-2146806784), 0);
        int int12 = calculator0.subtract(520297, 96);
        int int15 = calculator0.divide(20580, 780440677);
        int int18 = calculator0.multiply((-1820924517), 1497039730);
        int int21 = calculator0.multiply(1323847021, 8939518);
        int int24 = calculator0.multiply(1787900406, 351515216);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2146806784) + "'", int9 == (-2146806784));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 520201 + "'", int12 == 520201);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-581169146) + "'", int18 == (-581169146));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-477385434) + "'", int21 == (-477385434));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-425809696) + "'", int24 == (-425809696));
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply((-76), (int) (byte) 100);
        int int18 = calculator0.subtract(100, (-1));
        int int21 = calculator0.multiply((-5), 378379962);
        int int24 = calculator0.multiply(867154119, 2125191714);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7600) + "'", int15 == (-7600));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1891899810) + "'", int21 == (-1891899810));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-543358866) + "'", int24 == (-543358866));
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(867133591, (-15200));
        int int15 = calculator0.subtract((-1475972619), (-2201));
        int int18 = calculator0.add((-745367358), 1307876110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 867148791 + "'", int12 == 867148791);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1475970418) + "'", int15 == (-1475970418));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 562508752 + "'", int18 == 562508752);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(20580, (-685834));
        int int9 = calculator0.add(1152037536, 2);
        int int12 = calculator0.add(3563280, (-685834));
        int int15 = calculator0.multiply((-72482652), (-685328092));
        int int18 = calculator0.divide(1249740532, 378379961);
        int int21 = calculator0.multiply((-489636100), (-2036207232));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-665254) + "'", int6 == (-665254));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1152037538 + "'", int9 == 1152037538);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2877446 + "'", int12 == 2877446);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-146367728) + "'", int15 == (-146367728));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-257508864) + "'", int21 == (-257508864));
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.subtract(96, 97);
        int int15 = calculator0.multiply((-45), (-23318356));
        int int18 = calculator0.multiply(19670, 0);
        int int21 = calculator0.divide(11, 284903989);
        int int24 = calculator0.add((-10), 867154019);
        int int27 = calculator0.subtract((-132), 654086037);
        int int30 = calculator0.divide((-178330532), 868979689);
        int int33 = calculator0.multiply(0, 9);
        int int36 = calculator0.subtract((-42145093), (-46));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1049326020 + "'", int15 == 1049326020);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 867154009 + "'", int24 == 867154009);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-654086169) + "'", int27 == (-654086169));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-42145047) + "'", int36 == (-42145047));
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.subtract(1271882624, 3400);
        int int24 = calculator0.divide(780440677, 867133667);
        int int27 = calculator0.subtract(0, (-1481140680));
        int int30 = calculator0.add((-1820924396), (-121));
        int int33 = calculator0.add((-1685643349), (-1632794629));
        int int36 = calculator0.add((-164656960), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1481140680 + "'", int27 == 1481140680);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1820924517) + "'", int30 == (-1820924517));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 976529318 + "'", int33 == 976529318);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-164656960) + "'", int36 == (-164656960));
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.add((int) (short) 10, 867133501);
        int int21 = calculator0.add((-3528), (-7567));
        int int24 = calculator0.divide((-346346486), (int) (short) 100);
        int int27 = calculator0.add((int) (short) 0, (-757113551));
        int int30 = calculator0.divide((-567), 1145179044);
        int int33 = calculator0.subtract(0, 440742595);
        int int36 = calculator0.divide((-14300), 259575656);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 867133511 + "'", int18 == 867133511);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11095) + "'", int21 == (-11095));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3463464) + "'", int24 == (-3463464));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-757113551) + "'", int27 == (-757113551));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-440742595) + "'", int33 == (-440742595));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.multiply((int) (short) -1, 49164339);
        int int12 = calculator0.add(86698157, 21975739);
        int int15 = calculator0.multiply(1429824755, 1739617460);
        int int18 = calculator0.multiply((-1858814996), 767600052);
        int int21 = calculator0.multiply(1967350207, 794698580);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-49164339) + "'", int9 == (-49164339));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 108673896 + "'", int12 == 108673896);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 438900444 + "'", int15 == 438900444);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2093793808) + "'", int18 == (-2093793808));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1516556372) + "'", int21 == (-1516556372));
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.subtract((int) (short) 100, 98);
        int int24 = calculator0.add((-1813700023), (-747485824));
        int int27 = calculator0.multiply(2075617088, 1249740532);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1733781449 + "'", int24 == 1733781449);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-719722240) + "'", int27 == (-719722240));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply((-76), (int) (short) -1);
        int int18 = calculator0.multiply(20580, (-49164339));
        int int21 = calculator0.multiply(568480, (-86713457));
        int int24 = calculator0.divide((-1), (-2146806784));
        int int27 = calculator0.subtract((-1685448220), 1076984144);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 76 + "'", int15 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1810185236 + "'", int18 == 1810185236);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1526379168) + "'", int21 == (-1526379168));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1532534932 + "'", int27 == 1532534932);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.add(568480, 110);
        int int15 = calculator0.subtract(1787380221, 86713457);
        int int18 = calculator0.multiply(8671336, (-1481140680));
        int int21 = calculator0.multiply(178159040, (int) (byte) 0);
        int int24 = calculator0.add(287137963, 1739617460);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 568590 + "'", int12 == 568590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1700666764 + "'", int15 == 1700666764);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-161052992) + "'", int18 == (-161052992));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2026755423 + "'", int24 == 2026755423);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.multiply(100, (int) (byte) 0);
        int int18 = calculator0.add(98, (int) (byte) 0);
        int int21 = calculator0.multiply(97, 0);
        int int24 = calculator0.divide((-1876799488), (-1448314236));
        int int27 = calculator0.divide(1515036992, (-1985611728));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.subtract((int) (byte) -1, 0);
        int int21 = calculator0.divide((-9312), 867133515);
        int int24 = calculator0.add(232346435, (-52));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 232346383 + "'", int24 == 232346383);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract((-97), 110);
        int int12 = calculator0.add((-52891664), 2002932831);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-207) + "'", int9 == (-207));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1950041167 + "'", int12 == 1950041167);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.subtract(1925360681, 1672101496);
        int int12 = calculator0.add((-197121368), 940146681);
        int int15 = calculator0.add(302, (-790863895));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 253259185 + "'", int9 == 253259185);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 743025313 + "'", int12 == 743025313);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-790863593) + "'", int15 == (-790863593));
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.subtract((-1), (-97));
        int int21 = calculator0.add((-131), (-867133440));
        int int24 = calculator0.multiply((int) (byte) 0, (-3528));
        int int27 = calculator0.subtract((-86713651), 2233940);
        int int30 = calculator0.subtract((-868095375), (-1364644474));
        int int33 = calculator0.divide(8671336, (-1435799523));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-867133571) + "'", int21 == (-867133571));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-88947591) + "'", int27 == (-88947591));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 496549099 + "'", int30 == 496549099);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) ' ', (int) (byte) 100);
        int int15 = calculator0.subtract((-207), 86713344);
        int int18 = calculator0.divide((-96348159), 1013244259);
        int int21 = calculator0.add(2227920, 428644672);
        int int24 = calculator0.multiply((-424112214), 393);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-68) + "'", int12 == (-68));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713551) + "'", int15 == (-86713551));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 430872592 + "'", int21 == 430872592);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 827624442 + "'", int24 == 827624442);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((-3), 86713344);
        int int15 = calculator0.divide((-15300), 867133511);
        int int18 = calculator0.add(1152016958, 867142838);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2019159796 + "'", int18 == 2019159796);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.divide(10, 1);
        int int15 = calculator0.divide((-866613314), 692692992);
        int int18 = calculator0.add((int) (short) -1, (-111));
        int int21 = calculator0.subtract(1269639304, (-1555994343));
        int int24 = calculator0.divide(2130112384, (-7325507));
        int int27 = calculator0.subtract(282034071, (-341775412));
        int int30 = calculator0.add((-587860616), (-443263125));
        int int33 = calculator0.add(559875595, 1394242624);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-112) + "'", int18 == (-112));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1469333649) + "'", int21 == (-1469333649));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-290) + "'", int24 == (-290));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 623809483 + "'", int27 == 623809483);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1031123741) + "'", int30 == (-1031123741));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1954118219 + "'", int33 == 1954118219);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        int int15 = calculator0.subtract((-1145179180), (-1155286483));
        int int18 = calculator0.divide(258, (-34));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10107303 + "'", int15 == 10107303);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((-1357816827), 1810186246);
        int int21 = calculator0.divide(0, (-1010));
        int int24 = calculator0.multiply((-190), (-1380352289));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1126964223 + "'", int18 == 1126964223);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 273929854 + "'", int24 == 273929854);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.subtract(0, 867133515);
        int int18 = calculator0.multiply(0, 568480);
        int int21 = calculator0.multiply(2033296844, (-1357151485));
        int int24 = calculator0.subtract((-1311611038), 210);
        int int27 = calculator0.multiply((-570687692), (-15328878));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133515) + "'", int15 == (-867133515));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1007659676) + "'", int21 == (-1007659676));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1311611248) + "'", int24 == (-1311611248));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-266625112) + "'", int27 == (-266625112));
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.divide(867133546, (-442694645));
        int int21 = calculator0.subtract((-36), 1145179144);
        int int24 = calculator0.add((int) (byte) 1, (-3));
        int int27 = calculator0.divide(287137964, 1049326020);
        int int30 = calculator0.add(805111626, 1276937488);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1145179180) + "'", int21 == (-1145179180));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2082049114 + "'", int30 == 2082049114);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.multiply((-76), (-7480));
        int int9 = calculator0.add((-1951649816), 1754528448);
        int int12 = calculator0.divide(109415477, (-97));
        int int15 = calculator0.add(119647596, 568480);
        int int18 = calculator0.divide((-23207537), (-609789));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 568480 + "'", int6 == 568480);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-197121368) + "'", int9 == (-197121368));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1127994) + "'", int12 == (-1127994));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 120216076 + "'", int15 == 120216076);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 38 + "'", int18 == 38);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.divide((int) (short) 100, 10);
        int int15 = calculator0.add((int) '#', (-111));
        int int18 = calculator0.multiply(1, (int) ' ');
        int int21 = calculator0.divide((-1010), 86713455);
        int int24 = calculator0.add((int) (byte) 10, 867133491);
        int int27 = calculator0.divide((-1810185227), 1829824526);
        int int30 = calculator0.multiply((-757113354), (-1230276776));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-76) + "'", int15 == (-76));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 867133501 + "'", int24 == 867133501);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-121133424) + "'", int30 == (-121133424));
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.divide((-173436074), 96);
        int int24 = calculator0.subtract(25, 37489359);
        int int27 = calculator0.subtract((-147803819), 1754528548);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1806625) + "'", int21 == (-1806625));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-37489334) + "'", int24 == (-37489334));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1902332367) + "'", int27 == (-1902332367));
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract((-1700666664), (-241122442));
        int int18 = calculator0.divide((-105841579), 1454119969);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1459544222) + "'", int15 == (-1459544222));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.add(51, (int) (short) 1);
        int int15 = calculator0.add((-68), 32);
        int int18 = calculator0.multiply((int) '4', (-1820924396));
        int int21 = calculator0.subtract((-1160010088), 1892810111);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-36) + "'", int15 == (-36));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-198788080) + "'", int18 == (-198788080));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1242147097 + "'", int21 == 1242147097);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.subtract(2, 86713344);
        int int18 = calculator0.multiply(1700666860, (-15200));
        int int21 = calculator0.add((-757944310), (-433567285));
        int int24 = calculator0.subtract(1648341721, 91);
        int int27 = calculator0.multiply(430872592, (-241101862));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713342) + "'", int15 == (-86713342));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1271882624 + "'", int18 == 1271882624);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1191511595) + "'", int21 == (-1191511595));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1648341630 + "'", int24 == 1648341630);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2046382688) + "'", int27 == (-2046382688));
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.multiply(34, (-685834));
        int int21 = calculator0.subtract((-74870788), 0);
        int int24 = calculator0.subtract(887128884, (-685834));
        int int27 = calculator0.add(0, 65689586);
        int int30 = calculator0.divide(715729368, (-4818454));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-23318356) + "'", int18 == (-23318356));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-74870788) + "'", int21 == (-74870788));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 887814718 + "'", int24 == 887814718);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 65689586 + "'", int27 == 65689586);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-148) + "'", int30 == (-148));
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide((-1769916224), (-36));
        int int21 = calculator0.add((-9312), (-121));
        int int24 = calculator0.divide((-220), 1);
        int int27 = calculator0.subtract(1726946994, (-1308624019));
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9433) + "'", int21 == (-9433));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-220) + "'", int24 == (-220));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1259396283) + "'", int27 == (-1259396283));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((-46), (-867133537));
        int int18 = calculator0.divide(0, 108673896);
        int int21 = calculator0.add(86713455, (-1582342682));
        int int24 = calculator0.add((-1879178559), 537567364);
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 867133491 + "'", int15 == 867133491);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1495629227) + "'", int21 == (-1495629227));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1341611195) + "'", int24 == (-1341611195));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.add(33, (-7600));
        int int21 = calculator0.divide((-173436074), 96);
        int int24 = calculator0.subtract(25, 37489359);
        int int27 = calculator0.multiply(213009, 1371450554);
        int int30 = calculator0.add(23035, 1693566793);
        int int33 = calculator0.add(25529447, (-1719585270));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7567) + "'", int18 == (-7567));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1806625) + "'", int21 == (-1806625));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-37489334) + "'", int24 == (-37489334));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 520484954 + "'", int27 == 520484954);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1693589828 + "'", int30 == 1693589828);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1694055823) + "'", int33 == (-1694055823));
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.divide((int) (byte) 100, 95);
        int int18 = calculator0.divide(210, (-976));
        int int21 = calculator0.subtract(0, (-110));
        int int24 = calculator0.divide(213009, (-241122442));
        int int27 = calculator0.divide((-568590), 1495828402);
        int int30 = calculator0.subtract(0, 1237148811);
        int int33 = calculator0.divide((-563930142), (-60));
        int int36 = calculator0.subtract((-117501512), (-1171728053));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 110 + "'", int21 == 110);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1237148811) + "'", int30 == (-1237148811));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9398835 + "'", int33 == 9398835);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1054226541 + "'", int36 == 1054226541);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide((-1769916224), (-36));
        int int21 = calculator0.add((-9312), (-121));
        int int24 = calculator0.multiply((int) (short) -1, 0);
        int int27 = calculator0.add(867133546, (int) '#');
        int int30 = calculator0.add(0, 1367258876);
        int int33 = calculator0.multiply(2064, (-173436074));
        int int36 = calculator0.multiply((-1697414308), 1406938343);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9433) + "'", int21 == (-9433));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 867133581 + "'", int27 == 867133581);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1367258876 + "'", int30 == 1367258876);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1489771168) + "'", int33 == (-1489771168));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-964732924) + "'", int36 == (-964732924));
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide(97, (int) (byte) 10);
        int int12 = calculator0.add(51, (-97));
        int int15 = calculator0.multiply(1978473568, 1810185237);
        int int18 = calculator0.divide((-402505884), (-173426797));
        int int21 = calculator0.divide(0, 867133515);
        int int24 = calculator0.multiply(114096, 2139980843);
        int int27 = calculator0.divide((-15200), (-733999));
        int int30 = calculator0.divide(109415572, 1013244357);
        int int33 = calculator0.multiply(867153943, 867154009);
        int int36 = calculator0.subtract((-583759843), 1047786071);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46) + "'", int12 == (-46));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1057369120) + "'", int15 == (-1057369120));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1341547376) + "'", int24 == (-1341547376));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1323268097) + "'", int33 == (-1323268097));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1631545914) + "'", int36 == (-1631545914));
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract(568590, 20580);
        int int15 = calculator0.add(2115365205, 1323847021);
        int int18 = calculator0.add((-1587684236), (-198083164));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 548010 + "'", int12 == 548010);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-855755070) + "'", int15 == (-855755070));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1785767400) + "'", int18 == (-1785767400));
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.multiply((-68), 110);
        int int18 = calculator0.subtract(86713457, 76);
        int int21 = calculator0.add((-307225), (-7955541));
        int int24 = calculator0.multiply(1968577402, (-1665941363));
        int int27 = calculator0.add((-453239991), (-568590));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7480) + "'", int15 == (-7480));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86713381 + "'", int18 == 86713381);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8262766) + "'", int21 == (-8262766));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1017732558) + "'", int24 == (-1017732558));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-453808581) + "'", int27 == (-453808581));
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply((-76), (int) (short) -1);
        int int18 = calculator0.multiply(20580, (-49164339));
        int int21 = calculator0.multiply(568480, (-86713457));
        int int24 = calculator0.multiply((-1164468292), (-1448314236));
        int int27 = calculator0.add((-746856992), (-636451253));
        int int30 = calculator0.add(1432972439, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 76 + "'", int15 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1810185236 + "'", int18 == 1810185236);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1526379168) + "'", int21 == (-1526379168));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-425855760) + "'", int24 == (-425855760));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1383308245) + "'", int27 == (-1383308245));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1432972439 + "'", int30 == 1432972439);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((int) (short) 0, 34);
        int int15 = calculator0.multiply(290738210, (-1336575288));
        int int18 = calculator0.divide((-14813881), (-74870788));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1286025584) + "'", int15 == (-1286025584));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.divide(1771863899, 827072948);
        int int15 = calculator0.subtract(791316488, 282034071);
        int int18 = calculator0.subtract(937240470, 628881376);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 509282417 + "'", int15 == 509282417);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 308359094 + "'", int18 == 308359094);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.divide((-867133571), (-7600));
        int int21 = calculator0.subtract((-8085940), 757717952);
        int int24 = calculator0.multiply(1395, 0);
        int int27 = calculator0.subtract(766799182, (int) (short) -1);
        int int30 = calculator0.divide((-1951649816), (-1555994242));
        int int33 = calculator0.subtract(1202467776, (-153));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 114096 + "'", int18 == 114096);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-765803892) + "'", int21 == (-765803892));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 766799183 + "'", int27 == 766799183);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1202467929 + "'", int33 == 1202467929);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide(100, 98);
        int int21 = calculator0.multiply(3563280, 867133546);
        int int24 = calculator0.subtract(86713381, 1730079900);
        int int27 = calculator0.multiply(86713381, (-173436042));
        int int30 = calculator0.multiply(0, 1935);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1494342816 + "'", int21 == 1494342816);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1643366519) + "'", int24 == (-1643366519));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1829824526 + "'", int27 == 1829824526);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide(0, 10);
        int int12 = calculator0.divide((-3), 86713344);
        int int15 = calculator0.subtract((-520200), (-15));
        int int18 = calculator0.subtract((-2020), 1237148765);
        int int21 = calculator0.add(0, 866523750);
        int int24 = calculator0.subtract((-869367269), 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = calculator0.divide(1663900812, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot divide by zero");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-520185) + "'", int15 == (-520185));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1237150785) + "'", int18 == (-1237150785));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 866523750 + "'", int21 == 866523750);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-869367270) + "'", int24 == (-869367270));
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.subtract((-207), (-76));
        int int15 = calculator0.multiply((-1025747029), (-865230554));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-131) + "'", int12 == (-131));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 396791394 + "'", int15 == 396791394);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.subtract(757717952, 867133515);
        java.lang.Class<?> wildcardClass13 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-109415563) + "'", int12 == (-109415563));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.add((int) 'a', (int) (byte) 0);
        int int15 = calculator0.divide((-520200), (-7466));
        int int18 = calculator0.multiply((-86713457), 692692992);
        int int21 = calculator0.subtract(1271882624, 3400);
        int int24 = calculator0.add(287137963, 1);
        int int27 = calculator0.subtract((-23207515), (-1556003565));
        int int30 = calculator0.divide(1771863899, 867148791);
        int int33 = calculator0.multiply((-1224898), 791316488);
        int int36 = calculator0.multiply(278045632, 1484018126);
        int int39 = calculator0.subtract((-72012), (-555681721));
        java.lang.Class<?> wildcardClass40 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 69 + "'", int15 == 69);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 853334016 + "'", int18 == 853334016);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1271879224 + "'", int21 == 1271879224);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 287137964 + "'", int24 == 287137964);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1532796050 + "'", int27 == 1532796050);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1940875760 + "'", int33 == 1940875760);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-288390016) + "'", int36 == (-288390016));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 555609709 + "'", int39 == 555609709);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add(1890678640, (-961184742));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 929493898 + "'", int18 == 929493898);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.multiply((int) (byte) 0, (int) (short) 10);
        int int9 = calculator0.add((-97), (-867133440));
        int int12 = calculator0.subtract(86713344, (-111));
        int int15 = calculator0.multiply((int) (short) 100, (-152));
        int int18 = calculator0.divide((-1248231612), 1754528548);
        int int21 = calculator0.add(6153309, 1001242336);
        int int24 = calculator0.divide((-609789), 1144658859);
        int int27 = calculator0.multiply((int) 'a', (-609789));
        int int30 = calculator0.multiply((-1730079900), (-1428300941));
        int int33 = calculator0.subtract((-8262766), 13167513);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-867133537) + "'", int9 == (-867133537));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86713455 + "'", int12 == 86713455);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15200) + "'", int15 == (-15200));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1007395645 + "'", int21 == 1007395645);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-59149533) + "'", int27 == (-59149533));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1577468396 + "'", int30 == 1577468396);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-21430279) + "'", int33 == (-21430279));
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply(1, 1);
        int int6 = calculator0.divide((int) (short) 0, 101);
        int int9 = calculator0.add((-1), 0);
        int int12 = calculator0.subtract(109, (int) (short) 100);
        int int15 = calculator0.subtract((-36), (-31));
        int int18 = calculator0.subtract((int) (byte) 0, 1494342816);
        int int21 = calculator0.divide(1152037536, 37489359);
        int int24 = calculator0.add(910738184, (-1399144532));
        int int27 = calculator0.multiply((-290738176), (-1342472657));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1494342816) + "'", int18 == (-1494342816));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-488406348) + "'", int24 == (-488406348));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-500871168) + "'", int27 == (-500871168));
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.multiply(0, 0);
        int int18 = calculator0.multiply(867133667, (-97));
        int int21 = calculator0.divide(34, (-1923));
        int int24 = calculator0.subtract(1007395645, (-1556003565));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1787380221 + "'", int18 == 1787380221);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1731568086) + "'", int24 == (-1731568086));
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide((-1769916224), (-36));
        int int21 = calculator0.add((-9312), (-121));
        int int24 = calculator0.divide(20, 109415477);
        int int27 = calculator0.subtract((-938163200), 201951404);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9433) + "'", int21 == (-9433));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1140114604) + "'", int27 == (-1140114604));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.add((-68), (int) (byte) 10);
        int int21 = calculator0.add((-86713551), 94);
        int int24 = calculator0.subtract((-14), 0);
        int int27 = calculator0.multiply((-1735219513), (-2084640));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-58) + "'", int18 == (-58));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-86713457) + "'", int21 == (-86713457));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-14) + "'", int24 == (-14));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 649543200 + "'", int27 == 649543200);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(1219996744, 109415572);
        int int21 = calculator0.divide(1769916224, (-24578));
        int int24 = calculator0.divide(1754530371, (-867133342));
        int int27 = calculator0.add((-976), (-1286025584));
        int int30 = calculator0.divide((-879833140), 2085300411);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-72012) + "'", int21 == (-72012));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1286026560) + "'", int27 == (-1286026560));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.divide((int) (short) 10, (-97));
        int int18 = calculator0.subtract(0, 173435032);
        int int21 = calculator0.add(181871953, (-2093894088));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-173435032) + "'", int18 == (-173435032));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1912022135) + "'", int21 == (-1912022135));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.subtract(101, 0);
        int int12 = calculator0.multiply((int) (byte) 1, (-1010));
        int int15 = calculator0.subtract(0, 211766202);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1010) + "'", int12 == (-1010));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-211766202) + "'", int15 == (-211766202));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (byte) 1, 96);
        int int24 = calculator0.subtract((-867125924), (int) (byte) 0);
        int int27 = calculator0.divide(9277, 11);
        int int30 = calculator0.subtract((-442694645), 568480);
        int int33 = calculator0.subtract(1237148863, 98);
        int int36 = calculator0.multiply((-110), 130);
        int int39 = calculator0.add((-7600), 4);
        int int42 = calculator0.multiply((-8), 675399327);
        int int45 = calculator0.subtract((-1842586445), 489722585);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 96 + "'", int21 == 96);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-867125924) + "'", int24 == (-867125924));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 843 + "'", int27 == 843);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-443263125) + "'", int30 == (-443263125));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1237148765 + "'", int33 == 1237148765);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-14300) + "'", int36 == (-14300));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-7596) + "'", int39 == (-7596));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1108227320) + "'", int42 == (-1108227320));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1962658266 + "'", int45 == 1962658266);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add((int) (byte) 0, (int) 'a');
        int int12 = calculator0.divide((int) ' ', (-101));
        int int15 = calculator0.add(1152037484, (-6858340));
        int int18 = calculator0.multiply((-31), 9277);
        int int21 = calculator0.subtract((-76), (-917629359));
        java.lang.Class<?> wildcardClass22 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1145179144 + "'", int15 == 1145179144);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-287587) + "'", int18 == (-287587));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 917629283 + "'", int21 == 917629283);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.divide((int) '#', 100);
        int int12 = calculator0.subtract((int) (short) 0, (int) (byte) 1);
        int int15 = calculator0.subtract(0, (int) 'a');
        int int18 = calculator0.add((int) (byte) -1, (int) '4');
        int int21 = calculator0.subtract((int) (byte) 1, 32);
        int int24 = calculator0.multiply((-36), 1237148811);
        int int27 = calculator0.subtract(173200584, 228021803);
        int int30 = calculator0.subtract((-836700765), (-1154271480));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1587684236) + "'", int24 == (-1587684236));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-54821219) + "'", int27 == (-54821219));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 317570715 + "'", int30 == 317570715);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.subtract(2, 86713344);
        int int18 = calculator0.multiply(1700666860, (-15200));
        int int21 = calculator0.multiply(866523750, 1693566793);
        int int24 = calculator0.multiply((-867133666), (-2020));
        int int27 = calculator0.divide(1145186611, 173200584);
        int int30 = calculator0.subtract((-307808122), 0);
        int int33 = calculator0.divide((-1139871215), 656913876);
        int int36 = calculator0.subtract((-152), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713342) + "'", int15 == (-86713342));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1271882624 + "'", int18 == 1271882624);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1964453610) + "'", int21 == (-1964453610));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-736651448) + "'", int24 == (-736651448));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-307808122) + "'", int30 == (-307808122));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-152) + "'", int36 == (-152));
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.multiply(86713344, (-10));
        int int18 = calculator0.divide(76, 692692992);
        int int21 = calculator0.subtract(51, (-665254));
        int int24 = calculator0.multiply(131, 867133667);
        int int27 = calculator0.add((-86713342), 867154019);
        int int30 = calculator0.multiply((-49173772), (-991577216));
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-867133440) + "'", int15 == (-867133440));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 665305 + "'", int21 == 665305);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1925360681 + "'", int24 == 1925360681);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 780440677 + "'", int27 == 780440677);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 754562560 + "'", int30 == 754562560);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.subtract(2, 86713344);
        int int18 = calculator0.multiply(1700666860, (-15200));
        int int21 = calculator0.multiply(866523750, 1693566793);
        int int24 = calculator0.multiply((-867133666), (-2020));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86713342) + "'", int15 == (-86713342));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1271882624 + "'", int18 == 1271882624);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1964453610) + "'", int21 == (-1964453610));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-736651448) + "'", int24 == (-736651448));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.subtract((int) (byte) -1, 110);
        int int18 = calculator0.divide((-1769916224), (-36));
        int int21 = calculator0.add((-9312), (-121));
        int int24 = calculator0.divide(20, 109415477);
        int int27 = calculator0.subtract((-938163200), 201951404);
        int int30 = calculator0.add((-1121822200), 1035754419);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-111) + "'", int15 == (-111));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49164339 + "'", int18 == 49164339);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9433) + "'", int21 == (-9433));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1140114604) + "'", int27 == (-1140114604));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-86067781) + "'", int30 == (-86067781));
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(33, 98);
        int int9 = calculator0.divide((-68), (int) (byte) 100);
        int int12 = calculator0.add((-867133515), (-24578));
        int int15 = calculator0.multiply((-342552558), (-1032010672));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 131 + "'", int6 == 131);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-867158093) + "'", int12 == (-867158093));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 731565472 + "'", int15 == 731565472);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((-97), 96);
        int int15 = calculator0.multiply(1486954504, 911011581);
        int int18 = calculator0.multiply(2003425405, 867133381);
        int int21 = calculator0.divide(1429824755, (-1889283420));
        int int24 = calculator0.multiply((-308070992), (-121133424));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9312) + "'", int12 == (-9312));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1788602392) + "'", int15 == (-1788602392));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1593893681 + "'", int18 == 1593893681);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1133620480) + "'", int24 == (-1133620480));
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.add((int) (short) 100, 110);
        int int12 = calculator0.multiply((-23318356), 0);
        int int15 = calculator0.subtract((-346303569), (-1872794142));
        int int18 = calculator0.subtract((-542750104), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 210 + "'", int9 == 210);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1526490573 + "'", int15 == 1526490573);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-542750104) + "'", int18 == (-542750104));
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.multiply((int) (short) 0, (-68));
        int int15 = calculator0.add((int) (short) 0, 86713344);
        int int18 = calculator0.multiply((int) (short) 10, (-685834));
        int int21 = calculator0.divide((-76), (-3528));
        int int24 = calculator0.multiply(114939, (-417546408));
        int int27 = calculator0.multiply(1448299036, 1429923579);
        int int30 = calculator0.divide((-1539251552), 9552704);
        java.lang.Class<?> wildcardClass31 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86713344 + "'", int15 == 86713344);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6858340) + "'", int18 == (-6858340));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-402023608) + "'", int24 == (-402023608));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1902718604) + "'", int27 == (-1902718604));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-161) + "'", int30 == (-161));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.divide(33, (int) 'a');
        int int9 = calculator0.subtract((-1), (int) (short) 0);
        int int12 = calculator0.subtract((int) '#', (int) (short) 10);
        int int15 = calculator0.add(520297, (-867133611));
        int int18 = calculator0.subtract((-1923), (-109415650));
        int int21 = calculator0.subtract(780440677, 35);
        int int24 = calculator0.divide((-576693300), (-755028714));
        int int27 = calculator0.multiply(2, (-13365));
        int int30 = calculator0.multiply((-1772730154), 1090625663);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-866613314) + "'", int15 == (-866613314));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 109413727 + "'", int18 == 109413727);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 780440642 + "'", int21 == 780440642);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-26730) + "'", int27 == (-26730));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 556393002 + "'", int30 == 556393002);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.multiply((-97), (int) (short) 0);
        int int12 = calculator0.add((int) (byte) 1, 100);
        int int15 = calculator0.divide(51, 109);
        int int18 = calculator0.add(0, (-1919));
        int int21 = calculator0.divide(757717952, 9277);
        int int24 = calculator0.add(692330713, 1409005073);
        int int27 = calculator0.divide(1423849605, (-794097642));
        int int30 = calculator0.add((-1839639072), 1787380221);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1919) + "'", int18 == (-1919));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 81677 + "'", int21 == 81677);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2101335786 + "'", int24 == 2101335786);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-52258851) + "'", int30 == (-52258851));
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        Calculator calculator0 = new Calculator();
        int int3 = calculator0.multiply((int) (byte) 1, (int) (short) 100);
        int int6 = calculator0.add(0, 0);
        int int9 = calculator0.add(0, (int) (short) -1);
        int int12 = calculator0.subtract((int) 'a', (-1));
        int int15 = calculator0.subtract((int) (short) 0, (int) (short) 10);
        int int18 = calculator0.subtract((int) (byte) 0, (int) (short) 0);
        int int21 = calculator0.multiply((int) (short) 0, (int) ' ');
        int int24 = calculator0.add(867133491, (int) (byte) 100);
        int int27 = calculator0.add((-976549230), (-184662579));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 867133591 + "'", int24 == 867133591);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1161211809) + "'", int27 == (-1161211809));
    }
}

