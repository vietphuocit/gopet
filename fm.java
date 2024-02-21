public final class fm extends fh {
   private String[] a;
   public fi a;
   private fi[] a;
   private fn[] a;
   private fn a;
   private int a;
   private boolean n;

   public fm(String var1, gq var2, gq var3, int var4) {
      super(8, bc.c - gg.m - 69 - gg.p, bc.b - 16, 69);
      this.a = 0;
      this.n = false;
      this.y = gg.p;
      this.n = true;
      this.a = new fi();
      this.a.a(0, this.u - gg.m - 2 * (this.y + this.x), this.t - 2 * (this.y + this.x), gg.m);
      fi var6 = this.a;
      this.a(var6, false);
      this.d = var2;
      this.c = var3;
      this.a.a(var4);
      this.a.b("");
      this.a = gj.a.a(var1, this.t - 2 * (this.y + this.x));
      this.a.b = this.a.length * gj.a.a() + this.a.u + 2 * (this.y + this.x);
      if (this.a.b >= 70) {
         this.u = this.a.b;
      }

      this.c = this.a;
   }

   public final String a(int var1) {
      return this.a != null ? this.a.a() : this.a[var1].a();
   }

   public fm(String var1, String[] var2, int[] var3, gq var4, gq var5) {
      this(var1, var2, var3, (int[])null, var4, var5);
   }

   private fm(String var1, String[] var2, int[] var3, int[] var4, gq var5, gq var6) {
      super(bc.b / 10, 100, 4 * bc.b / 5, 2 * gg.m * var2.length + gg.p + gg.l);
      this.a = 0;
      this.n = false;
      this.y = gg.p;
      this.a = var3.length;
      this.a = new fi[this.a];
      this.a = new fn[this.a];
      this.n = false;
      this.l = true;
      this.c = 2;
      fn var7;
      if (var1 != null) {
         this.a = new fn(var1, gj.a);
         this.a.y = 0;
         this.a.a(0, 0, this.t, this.a.a.a() + 2);
         this.a.q = 17;
         var7 = this.a;
         this.a(var7, false);
      }

      for(int var8 = 0; var8 < this.a; ++var8) {
         this.a[var8] = new fi(0, gg.m + this.y, this.t - (this.y + this.x << 1), gg.m);
         this.a[var8].b = var3[var8];
         this.a[var8] = new fn(var2[var8]);
         this.a[var8].y = 0;
         this.a[var8].a(0, this.y << 1, this.t - (this.y << 1), this.a[var8].a.a() + 2);
         var7 = this.a[var8];
         this.a(var7, false);
         fi var9 = this.a[var8];
         this.a(var9, false);
      }

      this.d = var5;
      this.c = var6;
      this.c(1);
      this.c = this.a[0];
      if (this.a.b < bc.c - gg.l - gg.n) {
         this.u = this.a.b + (this.x + this.y << 1);
      } else {
         this.a.h = true;
         this.u = bc.c - gg.l - gg.n - 10;
      }

      this.w = (bc.c - this.u) / 2;
      if (this.a.b > this.u) {
         this.j = true;
      }

   }

   public final void a() {
      super.a();
      if (!this.n) {
         if (gg.a == 0) {
            gf.a(bc.a, gg.a, -1, this.y, -this.A + gg.m - 6, (this.t >> 1) - this.y, 1, true);
            gf.a(bc.a, -1, gg.a, (this.t >> 1) - this.y, -this.A + gg.m - 6, (this.t >> 1) - this.y, 1, true);
         } else {
            gf.a(bc.a, 4945818, -1, this.y, -this.A + gg.m - 6, (this.t >> 1) - this.y, 1, true);
            gf.a(bc.a, -1, 4945818, (this.t >> 1) - this.y, -this.A + gg.m - 6, (this.t >> 1) - this.y, 1, true);
         }
      } else {
         int var1 = (this.a.s >> 1) - (this.a.length * gj.a.a() >> 1);
         int var2 = 0;

         for(var1 = var1; var2 < this.a.length; var1 += gj.a.a()) {
            gj.a.a(bc.a, this.a[var2], (this.t >> 1) - this.y - this.x, var1, 17);
            ++var2;
         }

      }
   }
}
