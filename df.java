public final class df extends fs {
   private boolean a;
   private dg a;
   private br a;
   private fz a;
   private ce a;

   public df(br var1, boolean var2) {
      super(true);
      this.e = true;
      this.a = v.c();
      this.a = var1;
      this.a = var2;
      this.a = new dg(this.a);
      this.a.b(10 + (64 - this.a.t) / 2, 37);
      this.b.a(this.a);
      this.a.l();
      this.a = new fz(0, 132, bc.b, bc.c - gg.m - 5 - 132);
      this.a.j = true;
      this.a.l = true;
      this.a.c = 0;
      this.b.a(this.a);
      this.n = j.e;
   }

   public final void a() {
      bc.a.setColor(0);
      bc.a.fillRect(0, 0, bc.b, bc.c);
      br.a.a(this.a.l);
      gg.b(10, 20, bc.b - 20, 22);
      br.a(this.a.b, this.a.a, bc.b >> 1, 22);
      gg.b(10, 42, 64, 80);
      gg.b(74, 42, bc.b - 20 - 64, 80);
      gj.a.a(bc.a, "(str) " + String.valueOf(this.a.c), 85, 46, 0);
      gj.a.a(bc.a, "(agi) " + String.valueOf(this.a.d), 85, 64, 0);
      gj.a.a(bc.a, "(int) " + String.valueOf(this.a.e), 85, 82, 0);
      int var1 = 85 + (bc.b - 85 - 20 >> 1);
      gj.a.a(bc.a, "(atk) " + String.valueOf(this.a.f), var1, 46, 0);
      gj.a.a(bc.a, "(def) " + String.valueOf(this.a.g), var1, 64, 0);
      gj.a.a(bc.a, "(hp) " + String.valueOf(this.a.h) + "/" + this.a.j, var1, 82, 0);
      gj.a.a(bc.a, "(mp) " + String.valueOf(this.a.i) + "/" + this.a.k, var1, 100, 0);
      gg.b(10, 122, bc.b - 20, bc.c - 122 - 5 - gg.m);
   }

   public final void a(Object var1) {
      gq var2;
      int var3;
      switch((var2 = (gq)((Object[])var1)[0]).a) {
      case 0:
         var3 = (Integer)var2.a;
         j.a_(((dk)this.a.a(var3)).a);
         return;
      case 1:
         j.a("Chọn nguyên liệu", new gq(2, "Ok", var2.a, this), j.b);
         return;
      case 2:
         var3 = (Integer)var2.a;
         bf.a(this.a.a[var3], 9);
         j.e_();
         return;
      default:
         super.a(var1);
      }
   }

   public final void a(ce var1) {
      this.a = var1;
      this.a.a(var1);
      this.a.m();
      int var4 = 0;

      int var2;
      dk var3;
      for(var2 = 0; var2 < this.a.a.length; ++var2) {
         var3 = new dk(gj.a, this.a.a[var2], this.a.a[var2], this.a.b[var2], this.a.b[var2]);
         var4 = var2 * 20;
         var3.b(17, var4);
         this.a.a(var3);
         var3.d = new gq(0, "Xem", new Integer(var2), this);
         if (this.a) {
            var3.c = new gq(1, "Nâng cấp", new Integer(var2), this);
         }
      }

      var4 += 20;

      for(var2 = 0; var2 < this.a.c.length; ++var2) {
         (var3 = new dk(gj.a, 0, this.a.c[var2], this.a.c[var2], 0)).b(17, var4 + var2 * 20);
         this.a.a(var3);
      }

      this.a((fy)this.a.a(0));
      this.a.d(0, 250);
      this.a.c(true);
   }

   public final void a(int var1, int var2, String var3, String var4, int var5) {
      for(int var6 = 0; var6 < 3; ++var6) {
         dk var7;
         if ((var7 = (dk)this.a.a(var6)).a == var1) {
            var7.a = var2;
            var7.a(var3);
            var7.a = var4;
            var7.b = var5;
         }

         if (this.a.a[var6] == var1) {
            this.a.a[var6] = var2;
            this.a.b[var6] = var4;
            this.a.a[var6] = var3;
            this.a.b[var6] = var5;
         }
      }

   }
}
