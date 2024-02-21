public final class gg {
   public static int a = 345451;
   public static int b = 551328;
   public static int c = 16777215;
   public static int d = 7564651;
   public static int e = 16711680;
   private static int r = 6710886;
   public static int f = 0;
   public static int g = 5378829;
   public static int h = 16777215;
   public static int i = 16748544;
   public static int j = 16433664;
   public static int k = 40;
   public static int l = 20;
   public static int m = 20;
   public static int n = 20;
   public static int o = 8;
   public static int p = 3;
   public static int q = 6;
   public static byte a;

   public static void a(byte var0) {
      a = 1;
      d = 1160191;
      f = 16777215;
      g = 8955067;
      h = 0;
   }

   public static void a(String var0) {
      bc.a.translate(-bc.a.getTranslateX(), -bc.a.getTranslateY());
      bc.a.setClip(0, 0, bc.b, l);
      gf.a(bc.a, a, b, 0, 0, bc.b, l, false);
      bc.a.setColor(c);
      bc.a.drawLine(0, l - 1, bc.b, l - 1);
      gj.a.a(bc.a, var0, bc.d, l - gj.a.a() >> 1, 17);
   }

   public static void a(fs var0) {
      bc.a.translate(-bc.a.getTranslateX(), -bc.a.getTranslateY());
      bc.a.setClip(0, 0, bc.b, bc.c);
      if (fs.b != null && !var0.e) {
         bc.a.drawImage(fs.b, 0, bc.c - n + 1, 20);
      }

      if (var0.a != null) {
         a(var0.a, (gq)null, var0.a.d, var0.a.e);
      } else {
         fy var1;
         if (fs.a != null) {
            if ((var1 = fs.a.a(true)) == null) {
               a(var0.a, fs.a.c, fs.a.d, fs.a.e);
               return;
            }

            a(var0.a, var1.a(), var1.c(), var1.b());
         } else {
            if (var0.a() != null) {
               gq var2 = (var1 = var0.a(true)).a();
               gq var3 = var1.c();
               gq var4 = var1.b();
               a(var0.a, var0.a == null && var2 == null ? var0.l : var2, var0.a == null && var3 == null ? var0.m : var3, var0.a == null && var4 == null ? var0.n : var4);
               return;
            }

            a(var0.a, var0.l, var0.m, var0.n);
         }

      }
   }

   private static void a(fl var0, gq var1, gq var2, gq var3) {
      if (var1 != null) {
         var0.a(bc.a, var1.a, p, (n - gj.a.a() >> 1) + bc.c - n, 20);
      }

      if (var2 != null) {
         var0.a(bc.a, var2.a, bc.d, (n - gj.a.a() >> 1) + bc.c - n, 17);
      }

      if (var3 != null) {
         var0.a(bc.a, var3.a, bc.b - p, (n - gj.a.a() >> 1) + bc.c - n, 24);
      }

   }

   public static void a(int var0, int var1, int var2, int var3) {
      bc.a.translate(0, 0);
      bc.a.setColor(16777215);
      bc.a.fillRect(2, 1, var2 - 4, 1);
      bc.a.fillRect(2, var3 - 2, var2 - 4, 1);
      bc.a.fillRect(1, 2, 1, var3 - 4);
      bc.a.fillRect(var2 - 2, 2, 1, var3 - 4);
      bc.a.drawRect(2, 2, var2 - 5, var3 - 5);
      bc.a.setColor(0);
      bc.a.drawRoundRect(0, 0, var2 - 1, var3 - 1, 10, 10);
      bc.a.drawRect(3, 3, var2 - 7, var3 - 7);
      bc.a.translate(0, 0);
   }

   public static void b(int var0, int var1, int var2, int var3) {
      bc.a.translate(var0, var1);
      bc.a.setColor(a);
      bc.a.fillRect(3, 3, var2 - 6, var3 - 6);
      a(0, 0, var2, var3);
      bc.a.translate(-var0, -var1);
   }

   public static void a(fh var0) {
      gf.a(bc.a, a, b, 3, 3, var0.t - 6, var0.u - 2, false);
   }

   public static void a(ff var0) {
      if (var0.b()) {
         if (var0.e >>> 24 != 0) {
            bc.a.setColor(var0.e);
            bc.a.fillRoundRect(0, 0, var0.t - 1, var0.u - 1, 6, 6);
         } else {
            gf.a(bc.a, j, i, 1, 1, var0.t - 2, var0.u - 2, false);
         }
      } else if (var0.e && var0.c == 0) {
         if (var0.e >>> 24 != 0) {
            bc.a.setColor(var0.e);
            bc.a.fillRoundRect(0, 0, var0.t - 1, var0.u - 1, 6, 6);
         } else {
            gf.a(bc.a, b, a, 1, 1, var0.t - 2, var0.u - 2, false);
         }
      } else {
         if (var0.d >>> 24 != 0) {
            bc.a.setColor(var0.d);
            bc.a.fillRoundRect(0, 0, var0.t - 1, var0.u - 1, 6, 6);
         }

      }
   }

   public static void b(ff var0) {
      if (var0.e) {
         bc.a.setColor(d);
         bc.a.drawRoundRect(1, 1, var0.t - 3, var0.u - 3, 6, 6);
      }

   }

   public static void c(ff var0) {
      if ((var0.c == 1 || var0.c == 2) && var0.a && var0.a != null) {
         var0.a.a(bc.a, 2, 1, var0.a.b - var0.a.b >> 1, 0, 20);
      }

   }

   public static void d(ff var0) {
      if (a == 0) {
         if (var0.a || var0.e) {
            if (var0.e) {
               bc.a.setColor(var0.e);
            } else {
               bc.a.setColor(r);
            }

            bc.a.fillRect(2, 2, var0.t - 4, var0.u - 2);
            bc.a.setColor(3289650);
            bc.a.fillRect(2, 0, var0.t - 4, 1);
            bc.a.fillRect(0, 2, 1, var0.u - 1);
            bc.a.fillRect(var0.t - 1, 2, 1, var0.u - 1);
            bc.a.fillRect(1, 1, 1, 1);
            bc.a.fillRect(var0.t - 2, 1, 1, 1);
            return;
         }
      } else {
         if (var0.a || var0.e) {
            if (var0.e) {
               bc.a.setColor(var0.e);
            } else {
               bc.a.setColor(14478591);
            }

            bc.a.fillRect(2, 2, var0.t - 4, var0.u - 2);
            bc.a.setColor(3289650);
            bc.a.fillRect(2, 0, var0.t - 4, 1);
            bc.a.fillRect(0, 2, 1, var0.u - 1);
            bc.a.fillRect(var0.t - 1, 2, 1, var0.u - 1);
            bc.a.fillRect(1, 1, 1, 1);
            bc.a.fillRect(var0.t - 2, 1, 1, 1);
            bc.a.setColor(16777215);
            bc.a.fillRect(2, 1, var0.t - 4, 1);
            bc.a.fillRect(1, 2, 1, var0.u - 1);
            bc.a.fillRect(var0.t - 2, 2, 1, var0.u - 1);
            bc.a.fillRect(2, 2, 1, 1);
            bc.a.fillRect(var0.t - 3, 2, 1, 1);
            return;
         }

         bc.a.setColor(var0.d);
         bc.a.fillRect(1, 3, var0.t - 2, var0.u - 2);
         bc.a.setColor(6515815);
         bc.a.fillRect(1, 2, var0.t - 2, 1);
         bc.a.fillRect(0, 3, 1, var0.u - 2);
         bc.a.fillRect(1, 3, 1, 1);
         bc.a.fillRect(var0.t - 2, 3, 1, 1);
         bc.a.setColor(3289650);
         bc.a.fillRect(var0.t - 1, 3, 1, var0.u - 2);
      }

   }

   public static void a(fi var0) {
      if (var0.e) {
         bc.a.setColor(d);
      } else {
         bc.a.setColor(c);
      }

      if (var0.c == 0) {
         bc.a.drawRoundRect(0, 0, var0.t - 1, var0.u - 1, q, q);
      } else {
         bc.a.drawRoundRect(0 + var0.c, 0, var0.t - 1 - var0.c, var0.u - 1, q, q);
      }
   }

   public static void a(fo var0) {
      if (var0.b()) {
         gf.a(bc.a, j, i, 0, 0, var0.t - 1, var0.u - 1, false);
      } else {
         if (var0.e) {
            gf.a(bc.a, a, b, 0, 0, var0.t - 1, var0.u - 1, false);
         }

      }
   }

   public static void b(fo var0) {
      bc.a.setColor(5592405);
      bc.a.drawLine(0, 0, var0.t - 1, 0);
      if (var0.e) {
         bc.a.setColor(d);
         bc.a.drawRoundRect(0, 0, var0.t - 1, var0.u - 1, q, q);
      }

   }

   public static void a(fp var0) {
      bc.a.setColor(16777215);
      bc.a.fillRect(2, 1, var0.t - 4, 1);
      bc.a.fillRect(2, var0.u - 2, var0.t - 4, 1);
      bc.a.fillRect(1, 2, 1, var0.u - 4);
      bc.a.fillRect(var0.t - 2, 2, 1, var0.u - 4);
      bc.a.drawRect(2, 2, var0.t - 5, var0.u - 5);
      bc.a.setColor(0);
      bc.a.drawRoundRect(0, 0, var0.t - 1, var0.u - 1, 10, 10);
      bc.a.drawRect(3, 3, var0.t - 7, var0.u - 7);
   }

   public static void b(fp var0) {
      bc.a.setColor(345451);
      bc.a.fillRect(3, 3, var0.t - 6, var0.u - 6);
   }

   public static void a(fy var0) {
      if (var0.A != var0.B || var0.f) {
         bc.a.setClip(bc.a.getClipX() + var0.x, bc.a.getClipY() + var0.x, bc.a.getClipWidth() - (var0.x << 1), bc.a.getClipHeight() - (var0.x << 1));
         bc.a.setColor(201059015);
         bc.a.fillRoundRect(var0.t - 4 - var0.x, var0.E, 4, var0.D, 4, 4);
         bc.a.setColor(14582307);
         bc.a.fillRect(var0.t - 3 - var0.x, var0.E + 2, 2, var0.D - 4);
         bc.a.setClip(bc.a.getClipX() - var0.x, bc.a.getClipY() - var0.x, bc.a.getClipWidth() + (var0.x << 1), bc.a.getClipHeight() + (var0.x << 1));
      }

   }

   static {
      fl var10000 = gj.a;
   }
}
