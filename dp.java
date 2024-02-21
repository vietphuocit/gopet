public final class dp extends fh {
   private boolean n;
   private fn a;
   private String[] a;

   public dp(boolean var1, int var2) {
      var2 = bc.b - (gg.p << 1);
      int var3 = 90 + (gg.p << 2) + 6;
      int var4 = gg.m;
      this.a(gg.p, bc.c - var4 - var3 - this.y, var2, var3);
      this.e = j.b;
      this.n = var1;
   }

   public final void a(fn var1, String var2) {
      this.a = var1;
      this.a = gj.a.a(var2, bc.b - (gg.p << 1) - 50 - 5);
      fn var3 = this.a;
      this.a(var3, false);
      this.a.b(10, 5 + gj.a.a());
   }

   public final void c() {
      super.c();
      if (this.n) {
         gj.a.a(bc.a, "Thành công", this.t >> 1, 5, 17);
      } else {
         gj.a.a(bc.a, "Thất bại", this.t >> 1, 5, 17);
      }

      int var1 = 5 + gj.a.a() + 5;

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         gj.a.a(bc.a, this.a[var2], 50, var1 + (gj.a.a() + 2) * var2, 0);
      }

   }
}
