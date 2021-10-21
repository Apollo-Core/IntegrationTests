package at.uibk.dps.ee.itests;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class IntegrationTests {

  @Test
  @Timeout(value = 5, unit = TimeUnit.SECONDS)
  void testSingleAtomic() {
    IntegrationTest iTest = new IntegrationTest(ConstantsIntegrationTests.iTestSingleAtomic);
    iTest.runIntegrationTest();
  }

  @Test
  @Timeout(value = 5, unit = TimeUnit.SECONDS)
  void testSixAtomics() {
    IntegrationTest iTest = new IntegrationTest(ConstantsIntegrationTests.iTestSixAtomics);
    iTest.runIntegrationTest();
  }

  @Test
  @Timeout(value = 5, unit = TimeUnit.SECONDS)
  void testIfSimple() {
    IntegrationTest iTest = new IntegrationTest(ConstantsIntegrationTests.iTestIfSimple);
    iTest.runIntegrationTest();
  }

  @Test
  @Timeout(value = 5, unit = TimeUnit.SECONDS)
  void testParForSimple() {
    IntegrationTest iTest = new IntegrationTest(ConstantsIntegrationTests.iTestParForSimple);
    iTest.runIntegrationTest();
  }

  @Test
  @Timeout(value = 5, unit = TimeUnit.SECONDS)
  void testParForComplex() {
    IntegrationTest iTest = new IntegrationTest(ConstantsIntegrationTests.iTestParForComplex);
    iTest.runIntegrationTest();
  }

  @Test
  @Timeout(value = 5, unit = TimeUnit.SECONDS)
  void testElementIndex() {
    IntegrationTest iTest = new IntegrationTest(ConstantsIntegrationTests.iTestElementIndex);
    iTest.runIntegrationTest();
  }

  @Test
  @Timeout(value = 5, unit = TimeUnit.SECONDS)
  void testBlock() {
    IntegrationTest iTest = new IntegrationTest(ConstantsIntegrationTests.iTestBlock);
    iTest.runIntegrationTest();
  }

  @Test
  @Timeout(value = 5, unit = TimeUnit.SECONDS)
  void testSplit() {
    IntegrationTest iTest = new IntegrationTest(ConstantsIntegrationTests.iTestSplit);
    iTest.runIntegrationTest();
  }

  @Test
  @Timeout(value = 5, unit = TimeUnit.SECONDS)
  void testReplicate() {
    IntegrationTest iTest = new IntegrationTest(ConstantsIntegrationTests.iTestReplicate);
    iTest.runIntegrationTest();
  }

  @Test
  @Timeout(value = 5, unit = TimeUnit.SECONDS)
  void testWhile() {
    IntegrationTest iTest = new IntegrationTest(ConstantsIntegrationTests.iTestWhile);
    iTest.runIntegrationTest();
  }

  @Test
  @Timeout(value = 8, unit = TimeUnit.SECONDS)
  void testWhileFor() {
    IntegrationTest iTest = new IntegrationTest(ConstantsIntegrationTests.iTestWhileFor);
    iTest.runIntegrationTest();
  }

  @Test
  @Timeout(value = 5, unit = TimeUnit.SECONDS)
  void testWhileNested() {
    IntegrationTest iTest = new IntegrationTest(ConstantsIntegrationTests.iTestWhileComplex);
    iTest.runIntegrationTest();
  }

  @Test
  @Timeout(value = 5, unit = TimeUnit.SECONDS)
  void testWhileCount() {
    IntegrationTest iTest = new IntegrationTest(ConstantsIntegrationTests.iTestWhileCount);
    iTest.runIntegrationTest();
  }
}
