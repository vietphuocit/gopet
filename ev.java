import java.io.IOException;
import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

final class ev implements Runnable {
   private MessageConnection a;
   private final String a;
   private final String b;
   private final go a;
   private final go b;

   ev(String var1, String var2, go var3, go var4) {
      this.a = var1;
      this.b = var2;
      this.a = var3;
      this.b = var4;
      this.a = null;
   }

   public final void run() {
      try {
         this.a = (MessageConnection)Connector.open(this.a);
         TextMessage var1;
         (var1 = (TextMessage)this.a.newMessage("text")).setAddress(this.a);
         var1.setPayloadText(this.b + " " + eu.c + " " + bc.a.a.getAppProperty("RefCode"));
         this.a.send(var1);
         this.a.a(new Object[]{null, "smsOK"});
         return;
      } catch (Exception var8) {
         this.b.a(new Object[]{null, "smsFail"});
      } finally {
         if (this.a != null) {
            try {
               this.a.close();
            } catch (IOException var7) {
            }
         }

      }

   }
}
