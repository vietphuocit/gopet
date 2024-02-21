public final class do extends fh implements go {
   private cx[] a;
   public int a;
   public int[] a;

   public do(int var1) {
      this.a = var1;
      int var2 = bc.b - (gg.p << 1);
      int var3 = 90 + (gg.p << 2) + 6;
      int var4 = gg.m;
      this.a(gg.p, bc.c - var4 - var3 - this.y, var2, var3);
      byte var5 = 0;
      switch(var1) {
      case 0:
      case 2:
         var5 = 3;
         break;
      case 1:
      case 3:
         var5 = 2;
      }

      this.a = new cx[var5];

      for(var2 = 0; var2 < this.a.length; ++var2) {
         this.a[var2] = new cx();
         cx var6 = this.a[var2];
         this.a(var6, false);
         this.a[var2].b(20, gg.p + (30 + gg.p) * var2);
         if (var2 != 0) {
            this.a[var2].d = new gq(0, "Đổi", new Integer(var2), this);
         }
      }

      this.e = j.b;
      if (var1 != 0 && var1 != 2) {
         this.c = new gq(1, "Tiến hóa", this);
      } else {
         this.c = new gq(1, "Cường hóa", this);
      }
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
            gj.a.a(bc.a, this.a[var1].c, 60, gg.p + (30 + gg.p) * var1 + (30 - gj.a.a()) / 2, 0);
         }
      }

   }

   public final void a(Object var1) {
      ez var3;
      gq var5;
      int var7;
      switch((var5 = (gq)((Object[])var1)[0]).a) {
      case 0:
         j.e_();
         Integer var9 = (Integer)var5.a;
         switch(this.a) {
         case 0:
            bf.a(this.a[0].a, var9 + 6);
            return;
         case 1:
            bf.a(this.a[0].a, 123);
            return;
         case 2:
            var9;
            int var10001 = this.a[0].b;
            var7 = this.a[0].a;
            (var3 = new ez(81)).a(80);
            var3.b(var7);
            eu.a.a(var3);
            var3.a();
            return;
         case 3:
            var7 = this.a[0].a;
            ez var10;
            (var10 = new ez(81)).a(81);
            var10.b(var7);
            eu.a.a(var10);
            var10.a();
         default:
            return;
         }
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
            ez var4;
            int var8;
            switch(this.a) {
            case 0:
               var8 = this.a[2].a;
               var2 = this.a[1].a;
               var7 = this.a[0].a;
               (var4 = new ez(81)).a(48);
               var4.b(var7);
               var4.b(var2);
               var4.b(var8);
               eu.a.a(var4);
               var4.a();
               this.a = new int[3];
               break;
            case 1:
               var2 = this.a[1].a;
               var7 = this.a[0].a;
               (var3 = new ez(81)).a(49);
               var3.b(var7);
               var3.b(var2);
               eu.a.a(var3);
               var3.a();
               this.a = new int[2];
               break;
            case 2:
               var8 = this.a[2].a;
               var2 = this.a[1].a;
               var7 = this.a[0].a;
               (var4 = new ez(81)).a(76);
               var4.b(var7);
               var4.b(var2);
               var4.b(var8);
               eu.a.a(var4);
               var4.a();
               this.a = new int[3];
               break;
            case 3:
               var2 = this.a[1].a;
               var7 = this.a[0].a;
               (var3 = new ez(81)).a(79);
               var3.b(var7);
               var3.b(var2);
               eu.a.a(var3);
               var3.a();
               this.a = new int[2];
            }

            for(var2 = 0; var2 < this.a.length; ++var2) {
               this.a[var2] = this.a[var2].a;
            }

            return;
         }

         j.a_("Không đủ nguyên liệu");
      }

   }
}
