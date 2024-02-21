import java.util.Vector;
import javax.microedition.lcdui.Image;

public final class co extends fs {
   private static int a = 40;
   private static int b = 80;
   private int c;
   private String a;
   private byte a;
   private String b;
   private String[] a;
   private String e;
   private Image a;
   private int d;
   private long a;
   private boolean a;

   public co() {
      super(true);
      this.e = true;
      this.a = v.c();
      this.n = j.e;
   }

   public final void h() {
      this.a = null;
      this.a = false;
      this.m = new gq(2, "Kí gửi", this);
   }

   public final void a(int var1, String var2, String var3, String var4, int var5) {
      this.a = true;
      this.c = var1;
      this.a = var2;
      this.b = var3;
      this.a = gj.a.a(var3, bc.b - 15 - a - 5 - 15);
      this.e = var4;
      this.d = var5;
      this.a = System.currentTimeMillis();
      this.m = new gq(1, "Tùy chọn", this);
   }

   public final void a() {
      bc.a.setColor(0);
      bc.a.fillRect(0, 0, bc.b, bc.c);
      br.a.a();
      byte var1 = 20;
      gg.b(10, 20, bc.b - 20, 22);
      v.c().a(bc.a, "Gian hàng của bạn", bc.d, 22, 17);
      int var7 = var1 + 22;
      gg.b(10, 42, bc.b - 20, bc.c - gg.n - 42);
      if (!this.a) {
         gj.a.a(bc.a, "Chưa có đồ kí gửi", 15, 47, 0);
      } else {
         var7 += 10;
         if (this.a == null) {
            Image var2;
            if ((var2 = br.a.a(this.a)) != null) {
               this.a = gf.a(var2, var2.getHeight() << 1);
               a = this.a.getWidth();
               b = this.a.getHeight();
               if (this.a == 4) {
                  a >>= 1;
               }

               this.a = gj.a.a(this.b, bc.b - 15 - a - 5 - 15);
            }
         } else if (this.a == 4) {
            br.a.a(this.a, 20, 52, 0);
         } else {
            bc.a.setColor(0);
            bc.a.fillRect(18, 50, a + 4, b + 4);
            bc.a.drawImage(this.a, 20, 52, 0);
         }

         int var8 = gj.a.a() + 2;

         int var3;
         for(var3 = 0; var3 < this.a.length; ++var3) {
            gj.a.a(bc.a, this.a[var3], 20 + a + 10, var7, 0);
            var7 += var8;
         }

         gj.a.a(bc.a, this.e, 20 + a + 10, var7, 0);
         long var5 = (System.currentTimeMillis() - this.a) / 1000L;
         var3 = (int)((long)this.d - var5);
         var7 += var8 << 1;
         gj.a.a(bc.a, "Còn hiệu lực trong", bc.b >> 1, var7, 17);
         var7 += var8;
         String var9 = au.c((long)var3);
         gj.a.a(bc.a, var9, bc.b >> 1, var7, 17);
      }
   }

   public final void a(Object var1) {
      ez var2;
      switch(((gq)((Object[])var1)[0]).a) {
      case 1:
         Vector var5;
         (var5 = new Vector()).addElement(new gq(20, "Hủy kí gửi", this));
         this.a(var5, 2);
         return;
      case 2:
         j.e_();
         byte var4 = this.a;
         (var2 = new ez(81)).a(85);
         var2.a(var4);
         eu.a.a(var2);
         var2.a();
         return;
      case 20:
         j.e_();
         int var3 = this.c;
         (var2 = new ez(81)).a(87);
         var2.b(var3);
         eu.a.a(var2);
         var2.a();
      case 21:
      default:
      }
   }

   public final void a(byte var1) {
      this.a = var1;
   }
}
