package at.uibk.dps.ee.itests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import at.uibk.dps.ee.deploy.FileStringConverter;
import at.uibk.dps.ee.deploy.run.ImplementationRunBare;
import io.vertx.core.Vertx;

/**
 * Class representing a single integration test.
 * 
 * @author Fedor Smirnov
 */
public class IntegrationTest {

  protected final String afclFile;
  protected final String typeMappingsFile;
  protected final String inputFile;
  protected final String configFile;
  protected final String expectedFile;

  /**
   * Constructor.
   * 
   * @param iTestString the keyword referring to the current integration test.
   */
  public IntegrationTest(String iTestString) {
    this.afclFile = ConstantsIntegrationTests.getAFCLPath(iTestString);
    this.typeMappingsFile = ConstantsIntegrationTests.getTypeMappingsPath(iTestString);
    this.inputFile = ConstantsIntegrationTests.getInputPath(iTestString);
    this.configFile = ConstantsIntegrationTests.getConfigPath(iTestString);
    this.expectedFile = ConstantsIntegrationTests.getExpectedPath(iTestString);
  }


  /**
   * Runs the enactment and checks the result.
   */
  public void runIntegrationTest(Vertx vertx) {
    ImplementationRunBare enactmentRun = new ImplementationRunBare(vertx);
    JsonObject actual = enactmentRun.implement(afclFile, typeMappingsFile, inputFile, configFile);
    JsonObject expected =
        JsonParser.parseString(FileStringConverter.readInputFile(expectedFile)).getAsJsonObject();
    assertEquals(expected, actual);
  }
}
