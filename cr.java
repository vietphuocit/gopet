import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Image;

public final class cr extends fs {
   private cy a;
   private cx[] a;
   private String[] a;
   private do a;
   private cx a;
   private dl a;
   private dl b;
   private int a = 96;
   private int b;
   private int c;

   public cr() {
      super(true);
      this.b = bc.b - 30 - 30 - 15;
      this.c = bc.b - 30 - 15;
      this.e = true;
      this.a = v.c();
      this.n = new gq(1, "Đóng", this);
      this.a = new cy(15, 114, bc.b - 30, bc.c - 100 - 15 - 9 - gg.m, 30);
      this.b.a(this.a);
      this.m = new gq(2, "Chọn", this);
      Image var1 = null;

      try {
         var1 = Image.createImage("/pet/left.png");
      } catch (IOException var4) {
         var4.printStackTrace();
      }

      this.a = new dl(var1);
      this.a.a(this.b, this.a, 30, 20);
      this.a.a(new gq(17, "", this));
      Image var2 = null;

      try {
         var2 = Image.createImage("/pet/right.png");
      } catch (IOException var3) {
         var3.printStackTrace();
      }

      this.b = new dl(var2);
      this.b.a(this.c, this.a, 30, 20);
      this.b.a(new gq(18, "", this));
   }

   public final void a(cx[] var1) {
      this.b.b(this.a);
      this.b.b(this.b);
      if (var1 != null && var1.length > 0) {
         this.a = var1;

         for(int var3 = 0; var3 < this.a.length; ++var3) {
            this.a[var3].b = this;
         }

         this.a.a(var1);
         this.a.a(0);
         if (this.a.a > 1) {
            this.b.a(this.a);
            this.b.a(this.b);
            return;
         }
      } else {
         fn var2;
         (var2 = new fn("Không có item nào.", gj.a)).h = false;
         this.a.m();
         this.a.a(var2);
      }

   }

   public final void a() {
      bc.a.setColor(0);
      bc.a.fillRect(0, 0, bc.b, bc.c);
      br.a.a(0);
      gg.b(10, 20, bc.b - 20, 80);
      int var1;
      int var2;
      if (this.a != null) {
         var2 = 25;

         for(var1 = 0; var1 < this.a.length; ++var1) {
            gj.a.a(bc.a, this.a[var1], 20, var2, 0);
            var2 += gj.a.a() + 2;
         }
      }

      gg.b(10, 100, bc.b - 20, bc.c - 100 - 5 - gg.m);
      var1 = 20;

      for(var2 = 0; var2 < this.a.a; ++var2) {
         if (var2 == this.a.b) {
            bc.a.setColor(16777215);
         } else {
            bc.a.setColor(10000536);
         }

         bc.a.fillArc(var1, 107, 5, 5, 0, 360);
         var1 += 10;
      }

   }

   public final void a(Object var1) {
      gq var2;
      if ((var2 = (gq)((Object[])var1)[0]) == null) {
         fy var5 = (fy)((Object[])var1)[1];
         boolean var12 = false;

         for(int var3 = 0; var3 < this.a.length; ++var3) {
            if (var5 == this.a[var3]) {
               var12 = true;
            }
         }

         if (var12) {
            cx var9;
            if ((var9 = (cx)var5).c != null) {
               this.a = gj.a.a(var9.c, bc.b - 40);
            }

         } else {
            this.a = null;
         }
      } else {
         int var6;
         fy var7;
         cx var8;
         switch(var2.a) {
         case 1:
            this.a((fs)null);
            return;
         case 2:
            if ((var7 = this.a.a(true)) != null && var7 != this.a) {
               this.a.a(true);
               Vector var11;
               (var11 = new Vector()).addElement(new gq(3, "Cường hóa", this));
               var11.addElement(new gq(4, "Tiến hóa", this));
               var11.addElement(new gq(5, "Hủy", this));
               this.a(var11, 2);
               return;
            }

            return;
         case 3:
            if ((var7 = this.a.a(true)) != null && var7 != this.a) {
               if ((var8 = (cx)this.a.a(true)) != null) {
                  this.a = new do(2);
                  this.a.a(0, var8.a, var8.b, var8.c, var8.b);
                  this.a(this.a, false);
                  this.a = var8;
                  return;
               }
               break;
            }

            return;
         case 4:
            if ((var7 = this.a.a(true)) != null && var7 != this.a) {
               if ((var8 = (cx)this.a.a(true)) != null) {
                  this.a = new do(3);
                  this.a.a(0, var8.a, var8.b, var8.c, var8.b);
                  this.a(this.a, false);
                  this.a = var8;
                  return;
               }
               break;
            }

            return;
         case 5:
            if ((var7 = this.a.a(true)) != null && var7 != this.a) {
               if ((var8 = (cx)this.a.a(true)) != null) {
                  j.e_();
                  int var4 = var8.a;
                  ez var10;
                  (var10 = new ez(81)).a(83);
                  var10.b(var4);
                  eu.a.a(var10);
                  var10.a();
                  return;
               }
               break;
            }

            return;
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         default:
            super.a(var1);
            break;
         case 17:
            var6 = this.a.b == 0 ? 0 : this.a.b - 1;
            this.a.a(var6);
            return;
         case 18:
            var6 = this.a.b == this.a.a - 1 ? this.a.a - 1 : this.a.b + 1;
            this.a.a(var6);
            return;
         }

      }
   }

   public final void a(ez var1) {
      if (this.a != null) {
         int var2 = var1.a().readInt();
         String var3 = var1.a().readUTF();
         String var4 = var1.a().readUTF();
         int var5 = var1.a().readInt();
         switch(this.a.a) {
         case 2:
            byte var7 = 1;
            if (var5 == 12) {
               var7 = 2;
            }

            this.a.a(var7, var2, var3, var4, (byte)0);
            break;
         case 3:
            int var6 = var1.a().readInt();
            this.a.a(1, var2, var3, var4, (byte)var6);
         }

         this.a(this.a, true);
      }
   }

   public final void b(ez var1) {
      int var2 = var1.a().readInt();
      int var3 = var1.a().readInt();
      String var4 = var1.a().readUTF();
      int var9 = var1.a().readInt();
      if (this.a.a == 2) {
         for(int var6 = 0; var6 < this.a.length; ++var6) {
            if (this.a[var6].a == var2) {
               this.a[var6].c = var4;
               this.a[var6].b = String.valueOf(var3);
               this.a[var6].a((byte)var9);
               cx[] var10000 = this.a;
            }
         }
      } else {
         cx var5;
         (var5 = new cx()).a(this.a);
         var5.a = var2;
         var5.b = String.valueOf(var3);
         var5.c = var4;
         var5.a((byte)var9);
         var5.b = this;
         cx[] var11 = new cx[this.a.length - 1];
         int var7 = 0;

         for(int var8 = 0; var8 < this.a.length; ++var8) {
            if (this.a[var8].a != this.a.a[0] && this.a[var8].a != this.a.a[1]) {
               var11[var7++] = this.a[var8];
            }
         }

         var11[var7] = var5;
         this.a = new cx[var11.length];
         System.arraycopy(var11, 0, this.a, 0, this.a.length);
         this.b.b(this.a);
         this.a.a(this.a);
         this.a.a(0);
         this.b.a(this.a);
      }

      this.w();
      dp var10 = new dp(true, 30);
      cx var12;
      (var12 = new cx()).a = var2;
      var12.b = String.valueOf(var3);
      var12.a((byte)var9);
      var10.a(var12, var4);
      this.a(var10, false);
   }

   public final void c(ez var1) {
      int var5 = var1.a().readInt();
      cx[] var2 = new cx[this.a.length - 1];
      int var3 = 0;

      for(int var4 = 0; var4 < this.a.length; ++var4) {
         if (this.a[var4].a != var5) {
            var2[var3++] = this.a[var4];
         }
      }

      this.a = new cx[var2.length];
      System.arraycopy(var2, 0, this.a, 0, this.a.length);
      this.b.b(this.a);
      this.a.a(this.a);
      this.a.a(0);
      this.b.a(this.a);
      this.w();
   }

   public final void d(ez var1) {
      int var2 = var1.a().readInt();
      String var3 = var1.a().readUTF();
      String var4 = var1.a().readUTF();
      byte var6 = var1.a().readByte();

      for(int var5 = 0; var5 < this.a.length; ++var5) {
         if (this.a[var5].a == var2) {
            this.a[var5].c = var4;
            this.a[var5].b = var3;
            this.a[var5].a(var6);
            if (this.a.a(true) == this.a[var5]) {
               this.a[var5].b.a(new Object[]{null, this});
               return;
            }
            break;
         }
      }

   }
}
