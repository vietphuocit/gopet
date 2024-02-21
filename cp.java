import java.io.IOException;
import javax.microedition.lcdui.Image;

public final class cp extends fs {
   private int a;
   private String a;
   private String[] a;
   private int b;
   private String b;
   private String[] b;
   private String e;
   private String[] c;
   private Image a;
   private Image c;
   private Image d;
   private int c;
   private cq a;
   private cq b;
   private Image e;
   private int d;
   private int e = 42;
   private int f;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k;
   private int l;
   private int m;
   private int n = 0;
   private long a;
   private int o;

   public final void a(int var1, int var2, String var3, String[] var4) {
      switch(var1) {
      case 1:
         this.a = var2;
         this.a = var3;
         this.a = var4;
         this.a = null;
         break;
      case 2:
         this.b = var2;
         this.b = var3;
         this.b = var4;
         this.c = null;
         break;
      case 3:
         this.e = var3;
         this.c = var4;
         this.d = null;
      }

      this.i();
      if (var1 != 3 && this.a != -1 && this.b != -1) {
         if (this.a != this.b) {
            j.e_();
            var2 = this.b;
            var1 = this.a;
            ez var5;
            (var5 = new ez(81)).a(70);
            var5.b(var1);
            var5.b(var2);
            eu.a.a(var5);
            var5.a();
            return;
         }

         j.c("2 pet trùng nhau");
      }

   }

   public cp() {
      super(true);

      try {
         this.e = Image.createImage("/unknow.png");
      } catch (IOException var2) {
         var2.printStackTrace();
      }

      this.e = true;
      this.a = v.c();
      this.j();
      this.i();
   }

   private void i() {
      if (this.c != null) {
         this.f = 10 + gj.a.a() * this.c.length + (this.c.length - 1) * 3;
      } else {
         this.f = 10 + gj.a.a() * 3 + 6;
      }

      this.g = bc.c - gg.n - this.f - this.e;
      int var1 = (this.g - 100) / 4;
      this.h = var1;
      this.i = 50 + var1 * 3;
      var1 = 0;

      int var2;
      int var3;
      for(var2 = 0; var2 < this.a.length; ++var2) {
         var3 = gj.a.a(this.a[var2]);
         if (var1 < var3) {
            var1 = var3;
         }
      }

      for(var2 = 0; var2 < this.b.length; ++var2) {
         var3 = gj.a.a(this.b[var2]);
         if (var1 < var3) {
            var1 = var3;
         }
      }

      var2 = var1 + 75;
      this.j = bc.d - (var2 >> 1);
      this.a.a(this.j, this.h + this.e, 50, 50);
      this.b.a(this.j, this.i + this.e, 50, 50);
   }

   public final void a() {
      int var1;
      int var2;
      bc.a.setColor(0);
      bc.a.fillRect(0, 0, bc.b, bc.c);
      br.a.a();
      gg.b(10, 20, bc.b - 20, 22);
      v.c().a(bc.a, "Tiến hóa", bc.d, 22, 17);
      var1 = this.e;
      gg.b(10, var1, bc.b - 20, this.g);
      label35:
      switch(this.c) {
      case 0:
         var1 = this.e + this.h;
         this.a(1, this.j + 25, var1 + 25, 0, 3);

         for(var2 = 0; var2 < this.a.length; ++var2) {
            gj.a.a(bc.a, this.a[var2], this.j + 70 + 5, var1 + (gj.a.a() + 3) * var2, 0);
         }

         var1 = this.e + this.i;
         this.a(2, this.j + 25, var1 + 25, 0, 3);
         var2 = 0;

         while(true) {
            if (var2 >= this.b.length) {
               break label35;
            }

            gj.a.a(bc.a, this.b[var2], this.j + 70 + 5, var1 + (gj.a.a() + 3) * var2, 0);
            ++var2;
         }
      case 1:
         this.a(1, this.j + 25, this.e + this.k + 25, 0, 3);
         this.a(2, this.j + 25, this.e + this.l + 25, 0, 3);
         break;
      case 2:
         this.a(3, this.j + 25, this.e + this.m + 25, 0, 3);
      }

      var1 = this.e + this.g;
      gg.b(10, var1, bc.b - 20, this.f);

      for(var2 = 0; var2 < this.c.length; ++var2) {
         gj.a.a(bc.a, this.c[var2], bc.d, var1 + 5 + (gj.a.a() + 3) * var2, 17);
      }

   }

   public final void h_() {
      super.h_();
      if (this.c == 1) {
         switch(this.n) {
         case 0:
            boolean var1 = false;
            boolean var2 = false;
            if (this.k < this.m) {
               this.k += 2;
            }

            if (this.k >= this.m) {
               this.k = this.m;
               var1 = true;
            }

            if (this.l > this.m) {
               this.l -= 2;
            }

            if (this.l <= this.m) {
               this.l = this.m;
               var2 = true;
            }

            if (var1 && var2) {
               this.n = 1;
               this.a = System.currentTimeMillis();
               az var3;
               (var3 = new az(this.j + 25, this.e + this.m + 25, false)).a(2000);
               fs.e.addElement(var3);
            }
            break;
         case 1:
            if (System.currentTimeMillis() - this.a >= 2000L) {
               this.n = 0;
               this.c = 2;
               this.l = null;
               this.m = new gq(3, "Tiếp tục", this);
            }
         }
      }

      if (bc.a % 2 == 0) {
         ++this.o;
         if (this.o == gj.a.c) {
            this.o = 0;
         }
      }

   }

   public final void a(Object var1) {
      switch(((gq)((Object[])var1)[0]).a) {
      case 0:
         ez var8;
         (var8 = new ez(81)).a(72);
         eu.a.a(var8);
         var8.a();
         j.e_();
         return;
      case 1:
         j.e_();
         bf.e(1);
         return;
      case 2:
         j.e_();
         bf.e(2);
         return;
      case 3:
         this.j();
         return;
      case 4:
         this.d = 1;
         this.k();
         return;
      case 5:
         this.d = 2;
         this.k();
         return;
      case 6:
         j var10000 = j.a;
         String[] var6;
         if ((var6 = j.a(fs.a)) == null || var6.length == 0 || var6[0].equals("")) {
            j.c("Phải đặt tên cho pet mới");
            return;
         } else {
            String var2 = var6[0];
            j.e_();
            int var4 = this.d;
            String var3 = var2;
            int var9 = this.b;
            int var7 = this.a;
            ez var5;
            (var5 = new ez(81)).a(71);
            var5.b(var7);
            var5.b(var9);
            var5.a(var3);
            var5.a(var4);
            eu.a.a(var5);
            var5.a();
         }
      default:
      }
   }

   private void j() {
      this.n = j.e;
      this.l = new gq(0, "Tiến hóa", this);
      this.a = -1;
      this.b = -1;
      this.a = this.e;
      this.a = new String[]{"Chọn pet", "để tiến hóa"};
      this.c = this.e;
      this.b = new String[]{"Chọn pet", "để tiến hóa"};
      this.d = this.e;
      this.c = new String[]{"", ""};
      this.c = 0;
      if (this.a == null) {
         this.a = new cq(this, (byte)0);
         this.a.a(this.j, this.h + this.e, 50, 50);
         this.a.d = new gq(1, "Chọn pet", this);
      }

      this.b.a(this.a);
      if (this.b == null) {
         this.b = new cq(this, (byte)0);
         this.b.a(this.j, this.i + this.e, 50, 50);
         this.b.d = new gq(2, "Chọn pet", this);
      }

      this.b.a(this.b);
   }

   private void k() {
      gq var1 = new gq(6, "Ok", this);
      j.a(122, 7, 0, "Đặt tên pet mới", new String[]{""}, new byte[]{0}, var1).a(true);
   }

   private void a(int var1, int var2, int var3, int var4, int var5) {
      bv var10000;
      switch(var1) {
      case 1:
         if (this.a != null) {
            var10000 = br.a;
            bv.a(this.a, var2, var3, 0, 3);
            return;
         }

         this.a = br.a.a(this.a);
         gj.a.a(bc.a, this.o, var2, var3, 0, 3);
         return;
      case 2:
         if (this.c != null) {
            var10000 = br.a;
            bv.a(this.c, var2, var3, 0, 3);
            return;
         }

         this.c = br.a.a(this.b);
         gj.a.a(bc.a, this.o, var2, var3, 0, 3);
         return;
      case 3:
         if (this.d != null) {
            var10000 = br.a;
            bv.a(this.d, var2, var3, 0, 3);
            return;
         } else {
            this.d = br.a.a(this.e);
            gj.a.a(bc.a, this.o, var2, var3, 0, 3);
         }
      default:
      }
   }

   public final void h() {
      this.w();
      this.c = 1;
      this.n = 0;
      this.k = this.h;
      this.l = this.i;
      this.m = (this.h + this.i) / 2;
      this.b.b(this.a);
      this.b.b(this.b);
   }

   public final void b(int var1, int var2) {
      gq var3 = new gq(4, "Chọn", this);
      gq var4 = new gq(5, "Chọn", this);
      String var5 = var1 > 0 ? "1. " + var1 + " (vang)" : "1. Miễn phí";
      String var7 = var2 > 0 ? "2. " + var2 + " (ngoc)" : "2. Miễn phí";
      fh var6 = j.a(0, "Phí tiến hóa", new int[]{1, 2}, new String[]{var5, var7}, new byte[]{1, 1}, new gq[]{var3, var4});
      this.w();
      var6.a(true);
   }
}
