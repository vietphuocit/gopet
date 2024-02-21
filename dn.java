public final class dn extends fs {
   private cy a;
   private dm[] a;
   private String[] a;
   private dm a;
   private gq a;
   private gq b;
   private gq c;
   private int a;
   private dq a;

   public dn(br var1) {
      super(true);
      this.e = true;
      this.a = v.c();
      this.a = new cy(15, 132, bc.b - 30, bc.c - 132 - 10 - gg.m, 40);
      this.b.a(this.a);
      this.n = j.e;
      this.a = new gq(1, "Nâng cấp", this);
      this.b = new gq(2, "Xóa", this);
      this.c = new gq(3, "Xăm", this);
   }

   public final void a() {
      bc.a.setColor(0);
      bc.a.fillRect(0, 0, bc.b, bc.c);
      gg.b(10, 20, bc.b - 20, 102);
      int var1 = 20 + this.a;
      int var2 = bc.b >> 1;
      if (this.a != null) {
         for(int var3 = 0; var3 < this.a.length; ++var3) {
            gj.a.a(bc.a, this.a[var3], var2, var1, 17);
            var1 += gj.a.a() + 2;
         }
      }

      gg.b(10, 122, bc.b - 20, bc.c - 122 - 5 - gg.m);
   }

   public final void a(dm[] var1) {
      this.a = var1;

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         this.a[var2].b = this;
      }

      this.a.a(this.a);
      this.a.a(0);
   }

   public final void a(Object var1) {
      gq var2;
      int var6;
      if ((var2 = (gq)((Object[])var1)[0]) != null) {
         switch(var2.a) {
         case 1:
            this.a = new dq();
            this.a.a(0, this.a.a, this.a.b, this.a.c, this.a.b);
            this.a.a(true);
            return;
         case 2:
            j.a("Bạn có chắc muốn xóa hình xăm này chứ? (Cần mực tẩy))", new gq(4, "Xóa", this), j.b);
            return;
         case 3:
            j.e_();
            ez var9;
            (var9 = new ez(81)).a(90);
            var9.a(2);
            eu.a.a(var9);
            var9.a();
            return;
         case 4:
            var6 = this.a.a;
            ez var4;
            (var4 = new ez(81)).a(90);
            var4.a(3);
            var4.b(var6);
            eu.a.a(var4);
            var4.a();
            fs var7 = bc.a();
            fs.b(fs.a);
            j.e_();
         default:
            super.a(var1);
         }
      } else {
         fy var5 = (fy)((Object[])var1)[1];
         this.a = null;

         for(var6 = 0; var6 < this.a.length; ++var6) {
            if (var5 == this.a[var6]) {
               dm var3;
               if ((var3 = (dm)var5).c != null) {
                  this.a = gj.a.a(var3.c, bc.b - 100 - 10);
               }

               this.a = var3;
               int var8 = this.a.length * gj.a.a() + (this.a.length - 1 << 1);
               this.a = 102 - var8 >> 1;
            }
         }

         if (this.a != null) {
            switch(this.a.a) {
            case -1:
               this.m = null;
               this.l = null;
               return;
            case 0:
               this.m = this.c;
               this.l = null;
               return;
            default:
               this.m = this.a;
               this.l = this.b;
            }
         }

      }
   }

   public final void a(int var1, String var2, String var3) {
      if (this.a != null) {
         this.a.a(this.a.a, var1, var2, var3, (byte)0);
         this.a.a(true);
      }

   }
}
