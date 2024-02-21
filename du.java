import java.util.Vector;
import javax.microedition.lcdui.Image;

public final class du extends dz {
   private static Image[][] a = new Image[2][2];
   private static Image[][] b = new Image[2][2];
   private static Image[][] c = new Image[2][2];
   private static Image[][] d = new Image[2][2];
   private static Image[][] e = new Image[2][2];
   private static Image[][] f = new Image[2][2];
   private static Image[] a = new Image[2];
   private static Image[] b = new Image[2];
   public static Image a;
   private static short[][][] a = new short[][][]{{{26, 42, 22}, {24, 42, 24}}, {{22, 5, 27}, {0, 20, 67}}, {{23, 43, 26}, {23, 43, 26}}, {{9, 0, 47}, {23, 42, 26}}, {{26, 41, 23}}, {{24, 43, 25}}, {{25, 41, 23}}};
   private static int a = 27;
   private static int b = 10;
   private static int c = 22;
   private static int[] a = new int[]{0, 21, 20};
   private static int d = 60;
   private static byte[][] a = new byte[][]{{0, 0, 33, 42}, {0, 42, 11, 14}, {11, 42, 16, 14}};
   private static int e;
   private static int f;
   private static int g;
   private static int h;
   private static int i;
   private static int j;
   private static int k;

   public static void a(Vector var0, byte var1, int var2, int var3, int var4, boolean var5, int var6, int var7) {
      var6 += bc.a;
      boolean var13;
      int var10 = (var13 = var5 && var6 % 8 < 4) ? 2 : 1;
      int var8 = 0;
      if (!var5) {
         var8 = (var6 >> 5) % 2;
      }

      var2 -= a;
      var3 -= 74;
      bc.a.translate(var2, var3);
      bc.a.drawImage(a, a, 68, 17);
      if (var4 == 1) {
         bc.a.drawRegion(a[0], a[0][0], a[0][1], a[0][2], a[0][3], 0, b, c + var8, 0);
         bc.a.drawRegion(a[0], a[var10][0], a[var10][1], a[var10][2], a[var10][3], 0, a[var10], d, 0);
      } else {
         bc.a.drawRegion(a[1], 33 - a[0][0] - a[0][2], a[0][1], a[0][2], a[0][3], 0, 54 - b - 33, c + var8, 0);
         bc.a.drawRegion(a[1], 33 - a[var10][0] - a[var10][2], a[var10][1], a[var10][2], a[var10][3], 0, 54 - a[var10] - a[var10][2], d, 0);
      }

      a(var0 = new Vector(), var1);
      v.a();

      for(int var9 = 0; var9 < var0.size(); ++var9) {
         ef var11 = (ef)var0.elementAt(var9);
         Image var12 = var4 == 1 ? var11.a : var11.b;
         e = var11.b;
         f = var11.c;
         g = var12.getWidth();
         h = var12.getHeight();
         if (var11.a == 4 && var6 / 5 % 16 == 13) {
            if (var4 == 1) {
               bc.a.drawImage(b[0], 21, var8 + 38, 0);
            } else {
               bc.a.drawRegion(b[1], 0, 0, 18, 11, 0, 15, var8 + 38, 0);
            }
         } else if (var11.a != 8 && var11.a != 9) {
            if (var4 == 1) {
               bc.a.drawImage(var12, e, f + var8, 0);
            } else {
               bc.a.drawImage(var12, 54 - e - g, f + var8, 0);
            }
         } else {
            i = 54 - e;
            if (var11.a == 9) {
               j = g - i - 3;
            } else {
               j = g - i + 1;
            }

            k = g - j;
            if (var4 == 1) {
               if (!var13) {
                  bc.a.drawRegion(var12, 0, 0, i, h, 0, e, f, 0);
               } else {
                  bc.a.drawRegion(var12, j, 0, k, h, 0, 0, f, 0);
               }
            } else if (!var13) {
               bc.a.drawRegion(var12, j, 0, k, h, 0, i - k, f, 0);
            } else {
               bc.a.drawRegion(var12, 0, 0, i, h, 0, e + i - k, f, 0);
            }
         }
      }

      bc.a.translate(-var2, -var3);
   }

   private static void a(Vector var0, int var1) {
      if (var0 != null) {
         if (var1 == -1) {
            var1 = 0;
         }

         Vector var2 = var0;
         boolean[] var3 = new boolean[]{false, false, false, false, false, false};
         int var4 = var0.size();

         for(int var5 = 0; var5 < var4; ++var5) {
            switch(((ef)var2.elementAt(var5)).a) {
            case 2:
               var3[1] = true;
               break;
            case 3:
               var3[4] = true;
               break;
            case 4:
               var3[0] = true;
            case 5:
            case 6:
            default:
               break;
            case 7:
               var3[3] = true;
               break;
            case 8:
               var3[2] = true;
               break;
            case 9:
               var3[5] = true;
            }
         }

         if (!var3[0]) {
            var0.addElement(a(4, (byte)var1));
         }

         if (!var3[1]) {
            var0.addElement(a(2, (byte)var1));
         }

         if (!var3[2]) {
            var0.addElement(a(8, (byte)var1));
         }

         if (!var3[3]) {
            var0.addElement(a(7, (byte)var1));
         }

         if (!var3[4]) {
            var0.addElement(a(3, (byte)var1));
         }

         if (!var3[5]) {
            var0.addElement(a(9, (byte)var1));
         }

         var1 = var0.size();

         for(int var6 = 0; var6 < var1 - 1; ++var6) {
            for(int var7 = var6 + 1; var7 < var1; ++var7) {
               ef var8 = (ef)var0.elementAt(var6);
               ef var9;
               if ((var9 = (ef)var0.elementAt(var7)).d < var8.d) {
                  var0.setElementAt(var9, var6);
                  var0.setElementAt(var8, var7);
               }
            }
         }

      }
   }

   private static ef a(int var0, byte var1) {
      switch(var0) {
      case 2:
         return new ef(2, var1 == 0 ? 0 : 7, 15, -5, b[var1][0], b[var1][1]);
      case 3:
         return new ef(3, var1 == 0 ? -1 : 0, 14, -4, c[var1][0], c[var1][1]);
      case 4:
         return new ef(4, 18, var1 == 0 ? 35 : 36, -4, a[var1][0], a[var1][1]);
      case 5:
      case 6:
      default:
         return null;
      case 7:
         return new ef(7, var1 == 0 ? 22 : 18, var1 == 0 ? 51 : 50, -2, e[var1][0], e[var1][1]);
      case 8:
         return new ef(8, var1 == 0 ? 22 : 21, 59, -3, d[var1][0], d[var1][1]);
      case 9:
         return new ef(9, 21, 65, -4, f[var1][0], f[var1][1]);
      }
   }

   public static void a() {
      gi.a(v.a);
      a[0] = gi.a(0);
      a[1] = au.a(a[0]);
      b[0] = gi.a(1);
      b[1] = au.a(b[0]);
      a = gi.a(15);
      a[0][0] = gi.a(8);
      a[0][1] = au.a(a[0][0]);
      a[1][0] = gi.a(7);
      a[1][1] = au.a(a[1][0]);
      b[0][0] = gi.a(14);
      b[0][1] = au.a(b[0][0]);
      b[1][0] = gi.a(13);
      b[1][1] = au.a(b[1][0]);
      d[0][0] = gi.a(12);
      d[0][1] = au.a(d[0][0]);
      d[1][0] = gi.a(11);
      d[1][1] = au.a(d[1][0]);
      e[0][0] = gi.a(4);
      e[0][1] = au.a(e[0][0]);
      e[1][0] = gi.a(3);
      e[1][1] = au.a(e[1][0]);
      c[0][0] = gi.a(10);
      c[0][1] = au.a(c[0][0]);
      c[1][0] = gi.a(9);
      c[1][1] = au.a(c[1][0]);
      f[0][0] = gi.a(6);
      f[0][1] = au.a(f[0][0]);
      f[1][0] = gi.a(5);
      f[1][1] = au.a(f[1][0]);
   }

   public static void a(Image var0, int var1, int var2, int var3, boolean var4) {
      int var5 = bc.a + 1000;
      int var6 = var4 && var5 % 8 < 4 ? 1 : 0;
      var3 = var3 == 0 ? 2 : 0;
      bc.a.drawRegion(var0, var6 * (var0.getWidth() >> 1), 0, var0.getWidth() >> 1, var0.getHeight(), var3, var1, var2, 33);
   }

   static {
      byte[][][] var10000 = new byte[][][]{{{16, 58, 0, 2}, {20, 43, 0, 0}}, {{-2, 60, 0, 0}, {-2, 46, 0, 0}}};
      new Vector();
   }
}
