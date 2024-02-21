import javax.microedition.lcdui.Image;

public final class cw extends fh implements go {
   private int a;
   private String a;
   private int d;
   private int e;
   private long a;
   private int f;
   private Image a;

   public cw(int var1, String var2, int var3, int var4, int var5, int var6) {
      this.a = var1;
      this.a = var2;
      this.d = var5;
      this.e = var6;
      this.t = bc.b - (gg.p << 1);
      if (this.u > 0) {
         this.u = var4 + (this.y + this.x << 1) + 10;
      } else {
         this.u = 150;
      }

      this.a(gg.p, bc.c - gg.m - this.u - this.y, this.t, this.u);
      this.d = new gq(0, "OK", this);
      this.e = new gq(1, "Đóng", this);
   }

   public final void e() {
      super.e();
      long var1;
      if ((var1 = System.currentTimeMillis()) - this.a >= (long)this.e) {
         this.f = (this.f + 1) % this.d;
         this.a = var1;
      }

   }

   public final void c() {
      super.c();
      if (this.a == null) {
         this.a = br.a.a(this.a);
      } else {
         bc.a.translate(this.t >> 1, this.u >> 1);
         int var1 = this.a.getWidth() / this.d;
         bc.a.drawRegion(this.a, var1 * this.f, 0, var1, this.a.getHeight(), 0, 0, 0, 3);
         bc.a.translate(-(this.t >> 1), -(this.u >> 1));
      }
   }

   public final void a(Object var1) {
      switch(((gq)((Object[])var1)[0]).a) {
      case 0:
         ez var2;
         (var2 = new ez(122)).a(11);
         var2.b(this.a);
         eu.a.a(var2);
         var2.a();
         return;
      case 1:
         br.a.a(this.a);
         this.b_();
      default:
      }
   }
}
