public final class ft extends fz {
   public go a;
   public fg a;
   public fz a;

   public ft(int var1, int var2, int var3, int var4) {
      this(0, 0, var3, var4, gg.m);
   }

   private ft(int var1, int var2, int var3, int var4, int var5) {
      super(var1, var2, var3, var4);
      this.i = false;
      this.j = false;
      this.a = new fg(0, 0, var3, var5);
      this.a = new fz(0, var5 + 2, var3, var4 - var5 - 2);
      fg var6 = this.a;
      this.a(var6, false);
      fz var7 = this.a;
      this.a(var7, false);
      this.a.a = new fu(this);
      this.a.i = true;
   }

   public ft() {
      this(0, 0, bc.b, bc.c);
   }

   public final void a(String var1, fy var2) {
      fl var4 = gj.b;
      fy var3 = var2;
      int var5 = 0;
      fw var6;
      if (this.a.b() > 0) {
         var5 = (var6 = (fw)this.a.a[this.a.a.length - 1]).r + var6.t;
      }

      (var6 = new fw(var1)).a = var4;
      var6.a(var5, 0, Math.max(var6.a.a(var1), var6.b.a(var1)) + (var6.y << 1), gg.m);
      boolean var7 = false;
      this.d(0);
      if (var3 != null) {
         this.a.a(var6, false);
         var3.a(0, 0, this.a.t - (this.a.y << 1), this.a.u - (this.a.y << 1));
         this.a.a(var3, false);
         this.a.b = this.a.b() + 1;
         gl var10000 = this.a.a;
         var10000.a += var6.t;
         var3.g = false;
         var6.b = new fv(this, var6);
      }

      this.h();
   }

   private void d(int var1) {
      if (var1 < 0 || var1 > this.a.b()) {
         throw new IndexOutOfBoundsException("Index: " + var1);
      }
   }

   public final int a() {
      return this.a != null ? this.a.a : -1;
   }

   public final void a(int var1) {
      this.d(0);
      this.a.a(0);
   }

   public final void b(int var1) {
      this.d(var1);
      fy var2 = this.a.a(var1);
      bc.a().a(var2);
   }

   protected final void b() {
      bc.a.setColor(6990585);
      bc.a.drawRect(0, this.a.u, this.a.t - 1, 1);
   }

   public final void a_() {
      super.a_();
      fg var1 = this.a;
      bc.a().a((fy)var1);
   }

   public final void h() {
      int var1;
      int var2;
      if (this.a.m) {
         var1 = 0;

         for(var2 = 0; var2 < this.a.a.length; ++var2) {
            this.a.a[var2].v = this.a.a[var2].r = var1;
            var1 += this.a.a[var2].t;
         }

      } else {
         var1 = 0;

         for(var2 = 0; var2 < this.a.a.length; ++var2) {
            this.a.a[var2].t = (this.a.t - 2 * (this.x + this.y)) / this.a.a.length;
            this.a.a[var2].v = this.a.a[var2].r = var1;
            var1 += this.a.a[var2].t;
         }

      }
   }
}
