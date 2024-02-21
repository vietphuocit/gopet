import java.util.Vector;

public class ag extends fs implements go {
   public byte a = -1;
   public int a;
   protected fz a;
   private af[] a;

   public ag() {
      super(true);
      this.n = new gq(1, c.a(64), this);
   }

   public final void a(Vector var1) {
      this.b.b(this.a);
      this.a = new af[var1.size()];
      if (this.a == null) {
         this.a = new fz(0, gg.l, bc.b, bc.c - 2 * gg.l);
         this.a.j = true;
         this.a.l = true;
      }

      this.a.m();
      int var2 = var1.size();

      for(int var3 = 0; var3 < var2; ++var3) {
         af var4 = (af)var1.elementAt(var3);
         this.a[var3] = var4;
         h var5;
         (var5 = new h(var4, 0, 0, this.a.t, gg.k + (gg.p << 1))).c = v.c;
         var5.d = v.c;
         var5.a = gj.a;
         if (var4.a) {
            var5.d = new gq(2, c.a(419), var4, this);
         } else {
            var5.d = null;
         }

         this.a.a(var5, false);
      }

      this.a.c = 0;
      this.b.a(this.a);
      this.a.c(1);
      this.a.c(true);
   }

   public void a() {
      bc.a.setColor(0);
      bc.a.fillRect(0, 0, bc.b, bc.c);
   }

   public void a(Object var1) {
      ez var2;
      Integer var3;
      gq var5;
      int var6;
      ez var10;
      int var12;
      af var14;
      switch((var5 = (gq)((Object[])var1)[0]).a) {
      case 1:
         this.a((fs)null);
         return;
      case 2:
         if ((var14 = (af)var5.a).b) {
            gq var13 = new gq(3, var14.c, var14, this);
            j.a(var14.a, var14.b, (gq)null, var13, j.b, true);
            return;
         }

         eu.b(this.a, var14.a);
         if (var14.c) {
            this.a((fs)null);
            return;
         }
         break;
      case 3:
         fs.b(fs.a);
         var14 = (af)var5.a;
         switch(this.a) {
         case 1:
         case 3:
            gq[] var11 = new gq[var14.a.length];
            var12 = 0;

            for(; var12 < var11.length; ++var12) {
               if (var14.a[var12] != 0) {
                  var11[var12] = new gq(4, "Ok", new int[]{var14.a, var14.a[var12]}, this);
               }
            }

            j.a(0, "Thanh toán", var14.a, var14.a, var14.a, var11).a(true);
            return;
         case 2:
            eu.b(this.a, var14.a);
            if (var14.c) {
               this.a((fs)null);
            }
         default:
            return;
         }
      case 4:
         fs.b(fs.a);
         j.e_();
         int[] var7 = (int[])var5.a;
         int var10001 = var7[0];
         var12 = var7[1];
         int var9 = var10001;
         var6 = this.a;
         ez var4;
         (var4 = new ez(122)).a(9);
         var4.b(var6);
         var4.a(2);
         var4.b(var9);
         var4.b(var12);
         eu.a.a(var4);
         var4.a();
         return;
      case 5:
         (var10 = new ez(81)).a(74);
         eu.a.a(var10);
         var10.a();
         j.e_();
         return;
      case 6:
         j.e_();
         (var10 = new ez(81)).a(92);
         var10.a(5);
         eu.a.a(var10);
         var10.a();
         return;
      case 7:
         var3 = (Integer)var5.a;
         Vector var8;
         (var8 = new Vector()).addElement(new gq(8, "Sử dụng", var3, this));
         var8.addElement(new gq(9, "Nâng cấp", var3, this));
         this.a(var8, 2);
         return;
      case 8:
         var3 = (Integer)var5.a;
         var6 = this.a[var3].a;
         (var2 = new ez(81)).a(92);
         var2.a(4);
         var2.b(var6);
         eu.a.a(var2);
         var2.a();
         j.e_();
         return;
      case 9:
         var3 = (Integer)var5.a;
         var6 = this.a[var3].a;
         (var2 = new ez(81)).a(92);
         var2.a(6);
         var2.b(var6);
         eu.a.a(var2);
         var2.a();
         j.e_();
         return;
      case 10:
         if ((var6 = this.a.c()) != -1) {
            var6 = this.a[var6].a;
            (var2 = new ez(81)).a(99);
            var2.b(var6);
            eu.a.a(var2);
            var2.a();
            j.e_();
         }
      }

   }

   public final void a(int var1) {
      this.a = var1;
      switch(this.a) {
      case 81004:
         this.l = new gq(5, "Quản lý ngọc", this);
         return;
      case 81028:
         if ("Chợ pet".equals(this.d)) {
            this.l = new gq(10, "Xem hình xăm", this);
         }
      default:
         return;
      case 81040:
         this.l = new gq(6, "Tháo cánh", this);

         for(var1 = 0; var1 < this.a.a.length; ++var1) {
            this.a.a[var1].d = this.m = new gq(7, "Chọn", new Integer(var1), this);
         }

      }
   }

   public final void f() {
      super.f();
      v.d();
   }
}
