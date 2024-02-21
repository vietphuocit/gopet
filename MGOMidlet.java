import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class MGOMidlet extends MIDlet {
   protected void destroyApp(boolean var1) {
      j.c();
   }

   protected void pauseApp() {
      j.d_();
   }

   protected void startApp() {
      if (Display.getDisplay(this).getCurrent() == null) {
         if (bc.a == null) {
            j.a((MIDlet)this);
         }

         j.c_();
      } else {
         j.e();
      }
   }
}
