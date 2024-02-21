import java.io.IOException;
import java.io.InputStream;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;

final class ew implements Runnable {
   private final go a;
   private final go b;

   ew(go var1, go var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void run() {
      try {
         HttpConnection var1;
         (var1 = (HttpConnection)Connector.open(eu.d + "?" + System.currentTimeMillis())).setRequestMethod("GET");
         var1.setRequestProperty("Content-Type", "//text plain");
         var1.setRequestProperty("Connection", "close");
         if (var1.getResponseCode() == 200) {
            String var2 = "";
            InputStream var3 = var1.openInputStream();
            int var5;
            if ((var5 = (int)var1.getLength()) != -1) {
               byte[] var6 = new byte[var5];
               var3.read(var6);
               var2 = new String(var6);
            }

            eu.c(var2);
            z.i_();
            if (this.a != null) {
               this.a.a(eu.a);
            }

            return;
         }
      } catch (IOException var4) {
      }

      j.c(c.a(553));
      if (this.b != null) {
         this.b.a((Object)null);
      }

   }
}
