public final class dq extends fh implements go {
   private dm[] a;
   public int a;

   public dq() {
      int var1 = bc.b - (gg.p << 1);
      int var2 = 120 + (gg.p << 2) + 6;
      int var3 = gg.m;
      this.a(gg.p, bc.c - var3 - var2 - this.y, var1, var2);
      this.a = new dm[3];

      for(var1 = 0; var1 < this.a.length; ++var1) {
         this.a[var1] = new dm();
         dm var4 = this.a[var1];
         this.a(var4, false);
         this.a[var1].b(20, gg.p + (40 + gg.p) * var1);
         if (var1 != 0) {
            this.a[var1].d = new gq(0, "Đổi", new Integer(var1), this);
         }
      }

      this.e = j.b;
      this.c = new gq(1, "Nâng cấp", this);
   }

   public final void a(int var1, int var2, String var3, String var4, byte var5) {
      this.a[var1].a = var2;
      this.a[var1].b = var3;
      this.a[var1].c = var4;
      this.a[var1].a(var5);
   }

   public final void c() {
      super.c();

      for(int var1 = 0; var1 < this.a.length; ++var1) {
         if (this.a[var1].c != null) {
            gj.a.a(bc.a, this.a[var1].c, 70, gg.p + (40 + gg.p) * var1 + (40 - gj.a.a()) / 2, 0);
         }
      }

   }

   public final void a(Object var1) {
      gq var5;
      switch((var5 = (gq)((Object[])var1)[0]).a) {
      case 0:
         j.e_();
         Integer var8 = (Integer)var5.a;
         this.a = var8;
         byte var9 = var8.byteValue();
         ez var10;
         (var10 = new ez(81)).a(90);
         var10.a(4);
         var10.a(var9);
         eu.a.a(var10);
         var10.a();
         return;
      case 1:
         boolean var6 = true;

         int var2;
         for(var2 = 0; var2 < this.a.length; ++var2) {
            if (this.a[var2].a == 0) {
               var6 = false;
            }
         }

         if (var6) {
            j.a(true);
            int var3 = this.a[2].a;
            var2 = this.a[1].a;
            int var7 = this.a[0].a;
            ez var4;
            (var4 = new ez(81)).a(90);
            var4.a(5);
            var4.b(var7);
            var4.b(var2);
            var4.b(var3);
            eu.a.a(var4);
            var4.a();
            return;
         } else {
            j.a_("Không đủ nguyên liệu");
         }
      default:
      }
   }
}
