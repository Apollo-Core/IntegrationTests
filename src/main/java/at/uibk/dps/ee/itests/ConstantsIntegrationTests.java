package at.uibk.dps.ee.itests;

/**
 * The constants used during the integration tests.
 * 
 * @author Fedor Smirnov
 */
public class ConstantsIntegrationTests {

  // the strings referring to the individual integration test cases
  public static final String iTestSingleAtomic = "singleAtomic";
  public static final String iTestSixAtomics = "sixAtomics";
  public static final String iTestIfSimple = "ifSimple";
  public static final String iTestParForSimple = "parForSimple";
  public static final String iTestParForComplex = "parForComplex";
  public static final String iTestElementIndex = "elementIndex";
  public static final String iTestBlock = "block";
  public static final String iTestSplit = "split";
  public static final String iTestReplicate = "replicate";
  public static final String iTestWhile = "while";
  public static final String iTestWhileFor = "whileFor";
  public static final String iTestWhileComplex = "whileComplex";
  public static final String iTestWhileCount = "whileCount";
  public static final String iTestWhileWhile = "whileWhile";

  /**
   * No constructor.
   */
  private ConstantsIntegrationTests() {}

  /**
   * Returns the workflow file path corresponding to the given key work.
   * 
   * @param iTestString the given key word
   * @return the workflow file path corresponding to the given key work
   */
  public static String getAFCLPath(String iTestString) {
    return "./afcl/" + iTestString + ".yaml";
  }

  /**
   * Returns the type mappings file path corresponding to the given key work.
   * 
   * @param iTestString the given key word
   * @return the type mappings file path corresponding to the given key work
   */
  public static String getTypeMappingsPath(String iTestString) {
    return "./typeMappings/" + iTestString + ".json";
  }

  /**
   * Returns the input file path corresponding to the given key work.
   * 
   * @param iTestString the given key word
   * @return the input file path corresponding to the given key work
   */
  public static String getInputPath(String iTestString) {
    return "./input/" + iTestString + ".json";
  }

  /**
   * Returns the config file path corresponding to the given key work.
   * 
   * @param iTestString the given key word
   * @return the config file path corresponding to the given key work
   */
  public static String getConfigPath(String iTestString) {
    return "./configs/" + iTestString + ".xml";
  }

  /**
   * Returns the expected result file path corresponding to the given key work.
   * 
   * @param iTestString the given key word
   * @return the expected result file path corresponding to the given key work
   */
  public static String getExpectedPath(String iTestString) {
    return "./expected/" + iTestString + ".json";
  }


}
