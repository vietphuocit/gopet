import javax.microedition.lcdui.Image;

public final class y extends fh implements go {
   private String[] a;
   private int d = 0;
   private String a;
   public int a;
   private String b;
   private gq a;
   private gq f;
   private gq g;
   private String[] b;
   private int e;

   public y(int var1, String var2, String[] var3, int var4) {
      this.a = var1;
      String var5 = c.a(664);
      this.a = new gq(1, var5, this);
      this.f = new gq(2, c.a(364), this);
      this.g = new gq(3, "", this);
      this.a = var2;
      this.a = var3;
      this.b = this.a[0];
      this.y = gg.p;
      this.d = j.a;
      this.e = this.a;
      this.c = true;
      this.x = 3;
      this.t = bc.b - (gg.p << 1);
      this.a.a = this.t - 2 * this.y;
      this.b = gj.a.a(this.b, this.t - (gg.p + this.x << 2));
      this.u = gj.a.a() * this.b.length + (this.y + this.x << 1);
      if (this.u < 60) {
         this.u = 60;
      }

      this.a(gg.p, bc.c - this.u - this.y - gg.l, this.t, this.u);
      this.e = (this.u >> 1) - this.b.length * gj.a.a() / 2 - this.y - this.x;
   }

   public final void a() {
      super.a();
      Image var1 = v.a(this.a, (byte)1);
      int var2;
      int var3;
      if (this.a != null && var1 != null) {
         bc.a.drawImage(var1, var1.getWidth() >> 1, this.u - this.y - this.x >> 1, 3);
         var2 = 0;

         for(var3 = this.e; var2 < this.b.length; var3 += gj.a.a()) {
            gj.a.a(bc.a, this.b[var2], var1.getWidth() + gg.p, var3, 20);
            ++var2;
         }

      } else {
         var2 = 0;

         for(var3 = this.e; var2 < this.b.length; var3 += gj.a.a()) {
            gj.a.a(bc.a, this.b[var2], this.y + this.x << 1, var3, 20);
            ++var2;
         }

      }
   }

   private void c(String var1) {
      this.b = var1;
      Image var2 = v.a(this.a, (byte)1);
      if (this.a != null && var2 != null) {
         this.b = gj.a.a(this.b, this.t - (gg.p + this.x << 2) - (var2 != null ? var2.getWidth() : 0));
         this.u = gj.a.a() * this.b.length + (this.y + this.x << 1);
         if (this.u < (var2 != null ? var2.getHeight() : 0) + 2 * (this.y + this.x)) {
            this.u = (var2 != null ? var2.getHeight() : 0) + 2 * (this.y + this.x);
         }

         if (this.u < 60) {
            this.u = 60;
         }

         this.a(gg.p, bc.c - this.u - this.y - gg.l, this.t, this.u);
         this.e = (this.u >> 1) - this.b.length * gj.a.a() / 2 - this.y - this.x;
      }

   }

   public final void a(Object var1) {
      switch(((gq)((Object[])var1)[0]).a) {
      case 0:
         this.b_();
         j.b = 1;
         c.a("guide", j.b);
         return;
      case 1:
         if (this.d < this.a.length - 1) {
            ++this.d;
            this.c = this.f;
            if (this.d == this.a.length - 1) {
               this.e = this.g;
            }

            this.c(this.a[this.d]);
            return;
         }
         break;
      case 2:
         if (this.d > 0) {
            --this.d;
            this.e = this.a;
            if (this.d == 0) {
               this.c = this.g;
            }

            if (this.d > 0 && this.d < this.a.length) {
               this.e = this.a;
            }

            this.c(this.a[this.d]);
         }
      case 3:
      }

   }
}
