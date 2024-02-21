import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public abstract class a {
   private c a;
   private int a;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;

   public a(c var1) {
      this.a = var1;
   }

   public final void a(int var1) {
      this.a = 0;
      var1 = this.a << 1;
      this.c = this.a.a[var1 + 1] - this.a.a[var1] + 1;
      this.b(0);
      this.b();
   }

   public final void b(int var1) {
      this.b = var1;
      this.e = 0;
      var1 += this.a.a[this.a << 1];
      this.f = this.a.b[var1 << 2];
   }

   public final void c(int var1) {
      this.d = -1;
   }

   public final void a() {
      int var1 = this.a.a[this.a << 1] + this.b;
      if (this.e < this.a.b[(var1 << 2) + 1]) {
         ++this.e;
      } else {
         if (this.b >= this.c - 1) {
            if (this.d < 0) {
               this.c();
               return;
            }

            this.b = this.d - 1;
         }

         this.b(this.b + 1);
         var1 = this.a.a[this.a << 1] + this.b;
         short var2 = this.a.b[(var1 << 2) + 2];
         short var3 = this.a.b[(var1 << 2) + 3];
         this.a(this.a() == 1 ? -var2 : var2, this.a() == 2 ? -var3 : var3);
         ++this.e;
      }
   }

   public final void a(Graphics var1) {
      int var2 = this.a.f[this.f << 1];
      short var3 = this.a.f[(this.f << 1) + 1];
      int var4 = var1.getClipX();
      int var5 = var1.getClipY();
      int var6 = var1.getClipWidth();

      for(int var7 = var1.getClipHeight(); var2 < var3; var1.setClip(var4, var5, var6, var7)) {
         short var8 = this.a.c[var2++];
         short var9 = this.a.c[var2++];
         short var10 = this.a.c[var2++];
         byte var11 = (byte)this.a.c[var2++];
         int var15;
         int var16;
         int var22;
         int var23;
         int var32;
         if ((var11 & 1) == 0) {
            byte var31 = (byte)((var11 & 248) >> 3);
            byte var27 = (byte)((var27 = (byte)(var11 & 7)) >> 1);
            byte var24 = var31;
            var23 = var10;
            var22 = var9;
            var15 = var8 << 2;
            var16 = this.a.d[var15++];
            var32 = this.a.d[var15++];
            short var34 = this.a.d[var15++];
            short var35 = this.a.d[var15];
            byte var36 = this.a();
            if (var27 == var36) {
               var31 = 0;
            } else {
               if (var27 != 0 && var36 != 0) {
                  System.out.println("FLIP H and FLIP V, cannot be used at a same time, use your own implementation");
                  continue;
               }

               var31 = (byte)(var27 + var36);
            }

            if (var36 == 1) {
               var22 = -var9 - var34;
            } else if (var36 == 2) {
               var23 = -var10 - var35;
            }

            int var21;
            if (this.a.a) {
               Image var25 = ((Image[][])this.a.a.elementAt(var24))[var8 - this.a.e[var24]][0];
               var22 += this.a();
               var21 = var23 + this.b();
               if (var31 == 0) {
                  var1.drawImage(var25, var22, var21, 20);
               } else if (var31 == 1) {
                  var1.drawRegion(var25, 0, 0, var34, var35, 2, var22, var21, 20);
               } else if (var31 == 2) {
                  var1.drawRegion(var25, 0, 0, var34, var35, 2, var22, var21, 20);
               }
            } else {
               Image[] var26 = (Image[])this.a.a.elementAt(var24);
               if (var31 == 1) {
                  var16 = var26[0].getWidth() - var34 - var16;
               } else if (var31 == 1) {
                  var32 = var26[0].getHeight() - var35 - var32;
               }

               var22 += this.a();
               var21 = var23 + this.b();
               var1.clipRect(var22, var21, var34, var35);
               if (var31 == 0) {
                  var1.drawImage(var26[0], var22 - var16, var21 - var32, 20);
               } else if (var31 == 1) {
                  var1.drawRegion(var26[0], 0, 0, var26[0].getWidth(), var26[0].getHeight(), 2, var22 - var16, var21 - var32, 20);
               } else if (var31 == 2) {
                  var1.drawRegion(var26[0], 0, 0, var34, var35, 2, var22 - var16, var21 - var32, 20);
               }
            }
         } else {
            int var12;
            int var13;
            int var14;
            boolean var17;
            byte var18;
            int var19;
            int var10004;
            int var20;
            int var10005;
            int var10006;
            int var10007;
            int var10008;
            if (var11 != 1 && var11 != 3) {
               int var33;
               if (var11 == 5) {
                  var14 = var8 * 3;
                  var10004 = this.a.b[var14];
                  var10005 = this.a.b[var14 + 1];
                  var14 = this.a.b[var14 + 2];
                  var13 = var10005;
                  var12 = var10004;
                  var23 = var10;
                  var22 = var9;
                  byte var29;
                  if ((var29 = this.a()) == 1) {
                     var22 = -var9;
                     var12 = -var12;
                  } else if (var29 == 2) {
                     var23 = -var10;
                     var13 = -var13;
                  }

                  var16 = var22 + this.a();
                  var32 = var12 + this.a();
                  var33 = var23 + this.b();
                  var19 = var13 + this.b();
                  var1.setColor(var14);
                  var1.drawLine(var16, var33, var32, var19);
               } else if (var11 != 7 && var11 != 9) {
                  if (var11 == 11 || var11 == 13) {
                     var14 = var8 * 5;
                     var10004 = this.a.d[var14];
                     var10005 = this.a.d[var14 + 1];
                     var10006 = this.a.d[var14 + 2];
                     var10007 = this.a.d[var14 + 3];
                     var10008 = this.a.d[var14 + 4];
                     var17 = var11 == 13;
                     var16 = var10008;
                     var15 = var10007;
                     var14 = var10006;
                     var13 = var10005;
                     var12 = var10004;
                     var23 = var10;
                     var22 = var9;
                     if ((var18 = this.a()) == 1) {
                        var22 = -var9 - var12;
                     } else if (var18 == 2) {
                        var23 = -var10 - var13;
                     }

                     var19 = var22 + this.a();
                     var20 = var23 + this.b();
                     var1.setColor(var16);
                     if (var17) {
                        var1.fillRoundRect(var19, var20, var12, var13, var14, var15);
                     } else {
                        var1.drawRoundRect(var19, var20, var12, var13, var14, var15);
                     }
                  }
               } else {
                  var14 = var8 * 3;
                  var10004 = this.a.c[var14];
                  var10005 = this.a.c[var14 + 1];
                  var10006 = this.a.c[var14 + 2];
                  boolean var28 = var11 == 9;
                  var14 = var10006;
                  var13 = var10005;
                  var12 = var10004;
                  var23 = var10;
                  var22 = var9;
                  var1.setColor(var14);
                  byte var30;
                  if ((var30 = this.a()) == 1) {
                     var22 = -var9 - var12;
                  } else if (var30 == 2) {
                     var23 = -var10 - var13;
                  }

                  var32 = var22 + this.a();
                  var33 = var23 + this.b();
                  if (var28) {
                     var1.fillRect(var32, var33, var12, var13);
                  } else {
                     var1.drawRect(var32, var33, var12, var13);
                  }
               }
            } else {
               var14 = var8 * 5;
               var10004 = this.a.a[var14];
               var10005 = this.a.a[var14 + 1];
               var10006 = this.a.a[var14 + 2];
               var10007 = this.a.a[var14 + 3];
               var10008 = this.a.a[var14 + 4];
               var17 = var11 == 3;
               var16 = var10008;
               var15 = var10007;
               var14 = var10006;
               var13 = var10005;
               var12 = var10004;
               var23 = var10;
               var22 = var9;
               if ((var18 = this.a()) == 1) {
                  var22 = -var9 - var12;
               } else if (var18 == 2) {
                  var23 = -var10 - var13;
               }

               var19 = var22 + this.a();
               var20 = var23 + this.b();
               var1.setColor(var16);
               if (var17) {
                  var1.fillArc(var19, var20, var12, var13, var14, var15);
               } else {
                  var1.drawArc(var19, var20, var12, var13, var14, var15);
               }
            }
         }
      }

   }

   protected abstract int a();

   protected abstract int b();

   protected abstract void a(int var1, int var2);

   protected abstract byte a();

   protected abstract void b();

   protected abstract void c();
}
