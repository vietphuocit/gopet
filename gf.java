import java.util.Enumeration;
import java.util.Hashtable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class gf {
   private static boolean b = true;
   public static boolean a = true;
   private static Hashtable a;
   private static Hashtable b;

   public static Image a(Image var0, int var1) {
      int var2 = var0.getWidth() * var1 / var0.getHeight();
      int var10001 = var2;
      var2 = var1;
      var1 = var10001;
      int var3 = var0.getWidth();
      int var4 = var0.getHeight();
      if (var3 == var1 && var4 == var2) {
         return var0;
      } else {
         int[] var5 = new int[var1 * var2];
         int[] var8 = var5;
         int var7 = var1;
         int var6 = var2;
         var3 = var3;
         var0 = var0;
         int var9 = (var4 << 16) / var2;
         int var10;
         int var11 = (var10 = (var3 << 16) / var1) >> 1;
         int var12 = var9 >> 1;

         for(int var13 = 0; var13 < var6; ++var13) {
            var4 = var12 >> 16;
            int[] var17 = a(var0, 0, var4, var3, 1);

            for(int var14 = 0; var14 < var7; ++var14) {
               int var15 = var11 >> 16;
               int var16;
               if ((var16 = var14 + var13 * var7) >= 0 && var16 < var8.length && var15 < var17.length) {
                  var8[var16] = var17[var15];
               }

               var11 += var10;
            }

            var12 += var9;
            var11 = var10 >> 1;
         }

         return Image.createRGBImage(var5, var1, var2, true);
      }
   }

   public static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      Graphics var10000 = var0;
      boolean var9 = false;
      var0 = var10000;
      if (var5 >= 0 && var6 >= 0) {
         if (b) {
            Image var8;
            if ((var8 = a((Hashtable)a, var1, var2, 0, var5, var6, var7 ? 0 : 1)) == null) {
               b((var8 = Image.createImage(var5, var6)).getGraphics(), var1, var2, 0, 0, var5, var6, var7);
               if (a == null) {
                  a = new Hashtable();
               }

               a(var8, a, var1, var2, 0, var5, var6, var7 ? 0 : 1);
            }

            var0.drawImage(var8, var3, var4, 20);
         } else {
            b(var0, var1, var2, var3, var4, var5, var6, var7);
         }
      }
   }

   public static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if (a) {
         Image var11;
         if ((var11 = a((Hashtable)b, var1, var2, 1, var9, var10, 0)) == null) {
            Graphics var12;
            (var12 = (var11 = Image.createImage(var5, var6)).getGraphics()).setColor(var2);
            var12.fillRect(0, 0, var5, var6);
            a((Graphics)var12, var1, var2, 0, -10, var9, var10);
            var0.drawImage(var11, 0, 0, 20);
            if (b == null) {
               b = new Hashtable();
            }

            a(var11, b, var1, var2, 1, var9, var10, 0);
            return;
         }

         var0.drawImage(var11, 0, 0, 20);
      } else {
         var0.setColor(var2);
         var0.fillRect(0, 0, var5, var6);
         a((Graphics)var0, var1, var2, 0, -10, var9, var10);
      }

   }

   private static void b(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = var1 >> 16 & 255;
      int var9 = var1 >> 8 & 255;
      var1 &= 255;
      int var10 = var2 >> 16 & 255;
      int var11 = var2 >> 8 & 255;
      var2 &= 255;
      int var12 = var3 + var5;
      int var13 = var4 + var6;
      int var14;
      if (var7) {
         for(var14 = 0; var14 < var5; ++var14) {
            a(var0, var8, var9, var1, var10, var11, var2, var5, var14);
            var0.drawLine(var3 + var14, var4, var3 + var14, var13);
         }

      } else {
         for(var14 = 0; var14 < var6; ++var14) {
            a(var0, var8, var9, var1, var10, var11, var2, var6, var14);
            var0.drawLine(var3, var4 + var14, var12, var4 + var14);
         }

      }
   }

   private static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 >> 16 & 255;
      int var8 = var1 >> 8 & 255;
      var1 &= 255;
      int var9 = var2 >> 16 & 255;
      int var10 = var2 >> 8 & 255;
      var2 &= 255;

      for(int var11 = var6; var5 > 0 && var6 > 0; var6 -= 2) {
         a(var0, var7, var8, var1, var9, var10, var2, var11, var6);
         var0.fillArc(var3, var4, var5, var6, 0, 360);
         ++var3;
         ++var4;
         var5 -= 2;
      }

   }

   private static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      var1 = a(var1, var4, var7, var8);
      var2 = a(var2, var5, var7, var8);
      var3 = a(var3, var6, var7, var8);
      var1 = var1 << 16 & 16711680 | var2 << 8 & '\uff00' | var3 & 255;
      var0.setColor(var1);
   }

   private static int a(int var0, int var1, int var2, int var3) {
      if (var0 == var1) {
         return var0;
      } else {
         var2 = (var3 << 10) / var2;
         var2 = Math.abs(var0 - var1) * var2 >> 10;
         return var0 > var1 ? var0 - var2 : var0 + var2;
      }
   }

   private static void a(Image var0, Hashtable var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int[] var8 = new int[]{var2, var3, var4, var5, var6, var7};
      var1.put(var8, var0);
   }

   private static Image a(Hashtable var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var0 != null) {
         Enumeration var7 = var0.keys();

         while(var7.hasMoreElements()) {
            int[] var8;
            if ((var8 = (int[])var7.nextElement())[0] == var1 && var8[1] == var2 && var8[2] == var3 && var8[3] == var4 && var8[4] == var5 && var8[5] == var6) {
               return (Image)var0.get(var8);
            }
         }
      }

      return null;
   }

   public static Image b(Image var0, int var1) {
      int var2 = var0.getWidth();
      int var3 = var0.getHeight();
      int[] var5;
      int var4 = (var5 = a(var0)).length;

      while(true) {
         --var4;
         if (var4 < 0) {
            return Image.createRGBImage(var5, var2, var3, true);
         }

         if (var5[var4] >>> 24 > 0) {
            var5[var4] = var1;
         }
      }
   }

   public static Image a(Image var0, int var1, int var2) {
      int var3 = var0.getWidth();
      int var4 = var0.getHeight();
      int[] var6 = a(var0);
      int var5;
      if (var1 >>> 24 > 0) {
         var5 = var6.length;

         while(true) {
            --var5;
            if (var5 < 0) {
               break;
            }

            if (var6[var5] == var1) {
               var6[var5] = var2;
            }
         }
      } else {
         var5 = var6.length;

         while(true) {
            --var5;
            if (var5 < 0) {
               break;
            }

            if (var6[var5] >>> 24 > 0) {
               var6[var5] = var2;
            }
         }
      }

      return Image.createRGBImage(var6, var3, var4, true);
   }

   private static int[] a(Image var0) {
      return a(var0, 0, 0, var0.getWidth(), var0.getHeight());
   }

   private static int[] a(Image var0, int var1, int var2, int var3, int var4) {
      int[] var5 = new int[var1 = var3 * var4];
      int[] var6 = new int[var1];
      Image var7;
      Graphics var8;
      (var8 = (var7 = Image.createImage(var3, var4)).getGraphics()).setColor(0);
      var8.fillRect(0, 0, var3, var4);
      var8.drawRegion(var0, 0, var2, var3, var4, 0, 0, 0, 20);
      var7.getRGB(var5, 0, var3, 0, 0, var3, var4);
      var8.setColor(16777215);
      var8.fillRect(0, 0, var3, var4);
      var8.drawRegion(var0, 0, var2, var3, var4, 0, 0, 0, 20);
      var7.getRGB(var6, 0, var3, 0, 0, var3, var4);
      int[] var10 = new int[var1];
      var0.getRGB(var10, 0, var3, 0, var2, var3, var4);

      for(int var9 = 0; var9 < var1; ++var9) {
         if ((var5[var9] & 16777215) == 0 && (var6[var9] & 16777215) == 16777215) {
            var10[var9] = 0;
         }
      }

      return var10;
   }

   public static void a() {
      if (a != null) {
         a.clear();
         a = null;
      }

      if (b != null) {
         b.clear();
         b = null;
      }

   }
}
