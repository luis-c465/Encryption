package luisc.encryption;

import luisc.lib.BaseApp;
import luisc.lib.HelpModal;
import processing.event.MouseEvent;

/**
 * Main class for the application
 */
public final class App extends BaseApp {

  // Game classes
  public AppIntro intro;
  public Header header;
  public HelpModal helpModal;

  @Override
  public void draw() {
    defaultSettings();

    intro.update();
    if (doingIntro) {
      return;
    }

    header.update();

    helpModal.update();
  }

  @Override
  protected void setupAppClasses() {
    intro = new AppIntro(this);
    intro.setup();

    header = new Header(this);
    header.setup();

    helpModal = new HelpModal(this);
    helpModal.setup();
  }

  @Override
  public String getWindowTitle() {
    return "RICODE Encryption & Decryption";
  }

  public void mouseClicked(MouseEvent e) {
    helpModal.mouseClicked();
  }
}
