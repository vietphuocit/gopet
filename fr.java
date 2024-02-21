import javax.microedition.io.Connector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextField;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

public final class fr extends Form implements CommandListener {
   private TextField a = new TextField(gk.a(14) + ":", "", 15, 3);
   private TextField b;
   private Command a;
   private Command b;
   private Display a;
   private go a;

   public fr(String var1, String var2, go var3, Display var4) {
      super(var1);
      this.b = new TextField(gk.a(10) + ":", var2, 600, 0);
      this.a = new Command(gk.a(9), 4, 0);
      this.b = new Command(gk.a(8), 7, 1);
      this.a = var3;
      this.append(this.a);
      this.append(this.b);
      this.addCommand(this.a);
      this.addCommand(this.b);
      this.a = var4;
      this.setCommandListener(this);
   }

   public final void commandAction(Command var1, Displayable var2) {
      MessageConnection var9 = null;
      if (var1 == this.b) {
         this.a.a(new Object[]{new gq(-1, "", this.a), this});
      } else {
         if (var1 == this.a) {
            String var3 = this.a.getString();
            String var4 = this.b.getString();
            Alert var7;
            if (var3.equals("")) {
               (var7 = new Alert(gk.a(12))).setString(gk.a(15));
               var7.setTimeout(2000);
               this.a.setCurrent(var7);
               return;
            }

            try {
               var9 = (MessageConnection)Connector.open("sms://" + var3);
            } catch (Exception var5) {
               (var7 = new Alert("Alert")).setString(gk.a(11));
               var7.setTimeout(2000);
               this.a.setCurrent(var7);
            }

            try {
               TextMessage var8;
               (var8 = (TextMessage)var9.newMessage("text")).setAddress("sms://" + var3);
               var8.setPayloadText(var4);
               var9.send(var8);
               return;
            } catch (Exception var6) {
               (var7 = new Alert(gk.a(12), "", (Image)null, AlertType.INFO)).setTimeout(-2);
               var7.setString(gk.a(13));
               this.a.setCurrent(var7);
            }
         }

      }
   }
}
