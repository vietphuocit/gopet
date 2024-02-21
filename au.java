import java.util.Random;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class au {
   private static long a;
   private static Random a = new Random();

   public static String a(long var0) {
      String var2 = "";

      String var3;
      for(var3 = "" + var0; var3.length() > 3; var3 = var3.substring(0, var3.length() - 3)) {
         if (var2.length() == 0) {
            var2 = var3.substring(var3.length() - 3, var3.length());
         } else {
            var2 = var3.substring(var3.length() - 3, var3.length()) + "." + var2;
         }
      }

      if (var2.length() == 0) {
         return var3;
      } else {
         if (var0 < 0L && var3.equals("-")) {
            var2 = var3 + var2;
         } else {
            var2 = var3 + "." + var2;
         }

         return var2;
      }
   }

   public static int a(int var0) {
      return var0 > 0 ? var0 : -var0;
   }

   public static int b(int var0) {
      ++a;
      a.setSeed(a);
      return Math.abs(a.nextInt()) % var0;
   }

   public static String a(String var0, int var1) {
      return var0.length() <= 7 ? var0 : var0.substring(0, 7);
   }

   public static boolean a(int var0, int var1) {
      return (var0 >> var1 & 1) != 0;
   }

   private static byte[] a(long var0) {
      int var2 = (int)(var0 / 60L);
      byte var5 = (byte)((int)(var0 % 60L));
      int var1 = var2 / 60;
      byte var6 = (byte)(var2 %= 60);
      byte var3 = (byte)(var1 / 24);
      var1 %= 24;
      byte[] var4;
      (var4 = new byte[4])[0] = (byte)var1;
      var4[1] = var6;
      var4[2] = var5;
      var4[3] = var3;
      return var4;
   }

   public static String b(long var0) {
      byte[] var2 = a(var0);
      String var1 = "";
      if (var2[1] == 0) {
         var1 = var1 + "00:";
      } else if (var2[1] < 10) {
         var1 = var1 + "0" + var2[1] + ":";
      } else {
         var1 = var1 + var2[1] + ":";
      }

      if (var2[2] == 0) {
         var1 = var1 + "00";
      } else if (var2[2] < 10) {
         var1 = var1 + "0" + var2[2];
      } else {
         var1 = var1 + var2[2];
      }

      return var1;
   }

   public static String c(long var0) {
      byte[] var2 = a(var0);
      String var1 = "";
      if (var2[0] == 0) {
         var1 = var1 + "00:";
      } else if (var2[0] < 10) {
         var1 = var1 + "0" + var2[0] + ":";
      } else {
         var1 = var1 + var2[0] + ":";
      }

      if (var2[1] == 0) {
         var1 = var1 + "00:";
      } else if (var2[1] < 10) {
         var1 = var1 + "0" + var2[1] + ":";
      } else {
         var1 = var1 + var2[1] + ":";
      }

      if (var2[2] == 0) {
         var1 = var1 + "00";
      } else if (var2[2] < 10) {
         var1 = var1 + "0" + var2[2];
      } else {
         var1 = var1 + var2[2];
      }

      return var1;
   }

   public static void a(int var0, int var1, int var2, int var3, Graphics var4) {
      var4.translate(var0, var1);
      var4.fillRect(1, 1, 1, 1);
      var4.fillRect(2, 0, var2 - 4, 1);
      var4.fillRect(var2 - 2, 1, 1, 1);
      var4.fillRect(0, 2, 1, var3 - 4);
      var4.fillRect(var2 - 1, 2, 1, var3 - 4);
      var4.fillRect(1, var3 - 2, 1, 1);
      var4.fillRect(var2 - 2, var3 - 2, 1, 1);
      var4.fillRect(2, var3 - 1, var2 - 4, 1);
      var4.translate(-var0, -var1);
   }

   public static void b(int var0, int var1, int var2, int var3, Graphics var4) {
      var4.fillRect(var0 + 1, var1 + 1, var2 - 2, var3 - 2);
      a(var0, var1, var2, var3, var4);
   }

   public static Image a(Image var0) {
      int var1 = var0.getWidth();
      int var2 = var0.getHeight();
      int var3 = var1 >> 1;
      int[] var4 = new int[var1 * var2];
      var0.getRGB(var4, 0, var1, 0, 0, var1, var2);

      for(int var9 = 0; var9 < var2; ++var9) {
         int var7;
         int var8 = (var7 = var9 * var1) + var1 - 1;

         for(int var5 = 0; var5 < var3; ++var5) {
            int var6 = var4[var7 + var5];
            var4[var7 + var5] = var4[var8 - var5];
            var4[var8 - var5] = var6;
         }
      }

      return Image.createRGBImage(var4, var1, var2, true);
   }

   public static boolean a(gm var0, gm var1, gm var2) {
      boolean var3 = var0.a == var1.a && var1.a == var2.a && (var0.b <= var1.b && var1.b <= var2.b || var2.b <= var1.b && var1.b <= var0.b);
      return var0.b == var1.b && var1.b == var2.b && (var0.a <= var1.a && var1.a <= var2.a || var2.a <= var1.a && var1.a <= var0.a) || var3;
   }

   private static int a(long var0, int var2) {
      var2 = String.valueOf(var0).length() - 2;

      for(int var3 = 0; var3 < var2; ++var3) {
         var0 /= 10L;
      }

      return (int)var0;
   }

   public static String d(long var0) {
      int var2;
      int var3;
      if (var0 >= 1000000000L) {
         var2 = (int)(var0 / 1000000000L);
         var3 = (int)(var0 - (long)var2 * 1000000000L);
         return var2 + "." + a((long)var3, 2) + "G";
      } else if (var0 >= 1000000L) {
         var2 = (int)(var0 / 1000000L);
         var3 = (int)(var0 - (long)var2 * 1000000L);
         return var2 + "." + a((long)var3, 2) + "M";
      } else if (var0 >= 1000L) {
         var2 = (int)(var0 / 1000L);
         var3 = (int)(var0 - (long)var2 * 1000L);
         return var2 + "." + a((long)var3, 2) + "k";
      } else {
         return String.valueOf(var0);
      }
   }
}
