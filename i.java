public final class i extends fh {
   private boolean n = false;
   private int a;
   private int d;

   public final void a(int var1, int var2) {
      this.a = var1;
      this.d = var2;
      this.r = this.a - (this.t >> 1);
      this.s = this.d - this.u - 6;
      if (this.n && this.s < 0) {
         this.s = 0;
      }

      this.a(this.r, this.s, this.t, this.u);
   }

   public i(int var1, int var2, int var3, int var4, boolean var5) {
      this.n = true;
      this.y = 0;
      this.c = 0;
      this.m = true;
      this.l = true;
      this.a = 0;
      this.d = 0;
      this.t = var3;
      this.u = var4;
      this.r = this.a - (this.t >> 1);
      this.s = this.d - this.u - 5;
      if (this.n && this.s < 0) {
         this.s = 0;
      }

      this.x = 3;
      this.a(this.r, this.s, this.t, this.u);
   }

   public final void b() {
      as.a(bc.a, 0, 0, this.t, this.u - 5);
   }

   public final void c() {
      as.b(bc.a, this.t, this.u - 5);
   }

   protected final void d() {
      super.d();
      this.u = this.a.b = this.u + 5;
   }
}
