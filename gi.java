import java.io.DataInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class gi {
   private static String a;
   private static byte[] a = null;
   private static int[] a;
   private static int a = 0;

   public static void a(String var0) {
      a = null;
      a = var0;
   }

   public static Image a(String var0, int var1) {
      String var2 = a;
      a(var0);
      Image var3 = a(var1);
      a(var2);
      return var3;
   }

   private static void a() {
      if (a == null) {
         try {
            InputStream var0 = gj.a(a);
            int var1;
            DataInputStream var6;
            a = new int[var1 = (var6 = new DataInputStream(var0)).readInt()];
            int var3 = (var1 << 2) + 4;

            for(int var4 = 0; var4 < var1; ++var4) {
               int var2 = var6.readInt();
               a[var4] = var2 + var3;
            }

            var6.close();
            return;
         } catch (Exception var5) {
         }
      }

   }

   private static byte[] a(int var0) {
      a();
      byte[] var1 = new byte[1];

      try {
         InputStream var2 = gj.a(a);
         DataInputStream var5 = new DataInputStream(var2);
         int var3 = a[var0 + 1] - a[var0];
         var0 = a[var0];
         var1 = new byte[var3];
         var5.skip((long)var0);
         var5.read(var1);
         var5.close();
      } catch (Exception var4) {
      }

      ++a;
      return var1;
   }

   public static Image a(int var0) {
      a();
      Image var1 = Image.createImage(1, 1);

      try {
         byte[] var3;
         var1 = Image.createImage(var3 = a(var0), 0, var3.length);
      } catch (Exception var2) {
      }

      ++a;
      return var1;
   }
}
