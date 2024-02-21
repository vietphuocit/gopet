public final class fq extends fh {
   public int a = 0;
   private String[] a;
   private int d;
   private int e;
   private int f;
   private byte a = 0;

   public fq(String var1, gq var2, gq var3, gq var4, int var5) {
      this.y = gg.p;
      this.c = var2 == null ? b : var2;
      this.d = var3 == null ? b : var3;
      this.e = var4 == null ? b : var4;
      this.a = var5;
      if (var5 == 2) {
         this.e = gj.a.a >> 2;
         this.f = gj.a.b;
      } else if (var5 == 1) {
         this.c = true;
      }

      this.t = bc.b - (gg.p << 1);
      this.a.a = this.t - 2 * this.y;
      this.a = gj.a.a(var1, this.t - (var5 == 2 ? this.e + this.y + this.x : 2 * (this.y + this.x)));
      this.u = gj.a.a() * this.a.length + (this.y + this.x << 1);
      if (this.u < 60) {
         this.u = 60;
      }

      int var6 = gg.m;
      this.a(gg.p, bc.c - var6 - this.u - this.y, this.t, this.u);
      this.d = (this.u >> 1) - this.a.length * gj.a.a() / 2 - this.y - this.x;
   }

   public final void c() {
      if (this.a == 1) {
         bc.a.setColor(gg.e);
         bc.a.fillRect(2, 2, this.t - 4, this.u - 4);
      } else {
         super.c();
      }
   }

   public final void a() {
      super.a();
      if (this.a == 2) {
         gj.a.a(bc.a, this.a, this.y, (this.u >> 1) - (this.f >> 1) - this.y, 0, 0);
      }

      int var1 = 0;

      for(int var2 = this.d; var1 < this.a.length; var2 += gj.a.a()) {
         gj.a.a(bc.a, this.a[var1], (this.t + (this.a == 2 ? this.e + this.y : 0) >> 1) - (this.y << 1), var2, 17);
         ++var1;
      }

   }

   public final void e() {
      super.e();
      if (this.a == 2 && bc.a % 2 == 0) {
         ++this.a;
         if (this.a == gj.a.c) {
            this.a = 0;
         }
      }

   }
}
