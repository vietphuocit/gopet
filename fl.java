import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class fl {
   public static String[] a = new String[]{":D", ":P", ":)", ":@", "(c)", "/--", "(w)", "(b)", ":(", "(d)", "(s)", "8|", "(y)", "(n)", ":*", "U-", "(l)", ":S", "(?)", ":zZ", "(B)", "(h)", "(u)", "@^", "@-"};
   public static int a;
   public static String[] b;
   public static Image a = null;
   public static boolean a = true;
   public static Image b;
   private Image c;
   private String a;
   private byte[] a;
   public int b;
   private int c;
   private boolean b = true;

   public fl(fl var1, int var2) {
      this.a = var1.a;
      this.a = var1.a;
      this.b = var1.b;
      this.c = var1.c;
      this.c = gf.b(var1.c, -16777216);
   }

   public fl(fl var1, int var2, int var3) {
      this.a = var1.a;
      this.a = var1.a;
      this.b = var1.b;
      this.c = var1.c;
      this.c = gf.a(var1.c, var2, var3);
   }

   public fl(String var1, byte[] var2, int var3, Image var4, int var5) {
      this.a = var1;
      this.a = var2;
      this.b = var3;
      this.c = var5;
      this.c = var4;
   }

   public final void a(Graphics var1, String var2, int var3, int var4, int var5) {
      label74:
      while(true) {
         int var6 = var3;
         int var7 = var2.length();
         if ((var5 & 8) > 0) {
            var6 = var3 - this.a(var2);
         } else if ((var5 & 1) > 0) {
            var6 = var3 - (this.a(var2) >> 1);
         }

         int var10003;
         int var8;
         String var10;
         String var11;
         if (a && b != null) {
            for(var5 = 0; var5 < a.length; ++var5) {
               var10 = a[var5];
               if ((var8 = var2.indexOf(var10)) >= 0) {
                  var11 = var2.substring(0, var8);
                  var2 = var2.substring(var8 + var10.length(), var2.length());
                  this.a(var1, var11, var6, var4, 20);
                  var3 = this.a(var11);
                  var1.drawRegion(b, var5 * a, 0, a, a, 0, var6 + var3, var4 + (this.b >> 1), 6);
                  var10003 = a + var6 + var3;
                  var5 = 20;
                  var4 = var4;
                  var3 = var10003;
                  var2 = var2;
                  var1 = var1;
                  this = this;
                  continue label74;
               }
            }
         }

         if (a != null && b != null) {
            for(var5 = 0; var5 < b.length; ++var5) {
               var10 = b[var5];
               if ((var8 = var2.indexOf(var10)) >= 0) {
                  var11 = var2.substring(0, var8);
                  var2 = var2.substring(var8 + var10.length(), var2.length());
                  this.a(var1, var11, var6, var4, 20);
                  var3 = this.a(var11);
                  var1.drawRegion(a, var5 * 15, 0, 15, 15, 0, var6 + var3, var4 + (this.b >> 1), 6);
                  var10003 = var6 + 15 + var3;
                  var5 = 20;
                  var4 = var4;
                  var3 = var10003;
                  var2 = var2;
                  var1 = var1;
                  this = this;
                  continue label74;
               }
            }
         }

         for(var5 = 0; var5 < var7; ++var5) {
            if ((var3 = this.a.indexOf(var2.charAt(var5))) == -1) {
               var3 = 0;
            }

            if (var3 >= 0) {
               if (this.b) {
                  try {
                     var1.drawRegion(this.c, 0, var3 * this.b, this.a[var3], this.b, 0, var6, var4, 20);
                  } catch (Exception var9) {
                     System.out.println(var2);
                  }
               } else {
                  var1.drawRegion(this.c, ((Object[])null)[var3], 0, this.a[var3], this.b, 0, var6, var4, 20);
               }
            }

            var6 += this.a[var3] + (var5 < var7 - 1 ? this.c : 0);
         }

         return;
      }
   }

   public final void a(Graphics var1, String var2, int var3, int var4, int var5, int var6) {
      this.a(var1, var2, var3, var4, var5);
   }

   public final int a(String var1) {
      String var2;
      int var3;
      String var4;
      int var5;
      int var6;
      if (a && b != null && a != null) {
         for(var3 = 0; var3 < a.length; ++var3) {
            var4 = a[var3];
            if ((var5 = var1.indexOf(var4)) >= 0) {
               var2 = var1.substring(0, var5);
               var1 = var1.substring(var5 + var4.length(), var1.length());
               return (var6 = 0 + this.a(var2)) + a + this.a(var1);
            }
         }
      }

      if (b != null && a != null) {
         for(var3 = 0; var3 < b.length; ++var3) {
            var4 = b[var3];
            if ((var5 = var1.indexOf(var4)) >= 0) {
               var2 = var1.substring(0, var5);
               var1 = var1.substring(var5 + var4.length(), var1.length());
               var6 = 0 + this.a(var2);
               var6 += 15;
               return var6 + this.a(var1);
            }
         }
      }

      var3 = 0;
      int var7 = var1.length();

      for(var5 = 0; var5 < var7; ++var5) {
         if ((var6 = this.a.indexOf(var1.charAt(var5))) == -1) {
            var6 = 0;
         }

         var3 += this.a[var6] + (var5 < var7 - 1 ? this.c : 0);
      }

      return var3;
   }

   public final String[] a(String var1, int var2) {
      Vector var3 = new Vector();
      int var4 = 0;
      int var5 = var1.length();

      for(int var6 = 0; var4 < var5; var6 = var4) {
         int var7 = var4;

         int var8;
         for(var8 = -1; var7 < var5; ++var7) {
            if (this.a(var1.substring(var4, var7 + 1)) > var2) {
               if (var8 == -1) {
                  var8 = var7;
               }
               break;
            }

            if (var1.charAt(var7) == ' ') {
               var8 = var7;
            } else if (var1.charAt(var7) == '\n') {
               var8 = var7;
               break;
            }
         }

         if (var7 != var5 && var8 > var4) {
            var4 = var8;
         } else {
            var4 = var7;
         }

         var3.addElement(var1.substring(var6, var4).trim());
         if (var4 >= 0 && var4 < var5 && var1.charAt(var4) == '\n') {
            ++var4;
         }
      }

      String[] var10 = new String[var3.size()];
      var3.copyInto(var10);
      return var10;
   }

   public final int a() {
      return this.b;
   }
}
