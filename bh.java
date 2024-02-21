public final class bh {
   private byte a;
   private int a;
   private Object a;
   private final bg a;

   public bh(bg var1, int var2, int var3, Object var4) {
      this.a = var1;
      this.a = (byte)var2;
      this.a = var3;
      this.a = var4;
   }

   public final void a() {
      int[] var1;
      bq var3;
      switch(this.a) {
      case 0:
         this.a.a[this.a].a();
         return;
      case 1:
         switch((var1 = (int[])this.a)[0]) {
         case 0:
            this.a.a[this.a].a(var1[1]);
            return;
         case 1:
            this.a.a[this.a].b();
            return;
         case 2:
            this.a.a[this.a].c(var1[1]);
         default:
            return;
         }
      case 2:
         this.a.b = true;
         return;
      case 3:
      default:
         break;
      case 4:
         var1 = (int[])this.a;
         this.a.a[this.a].c(var1[0], var1[1]);
         return;
      case 5:
         int var5 = (Integer)this.a;
         this.a.a[this.a].b(var5);
         return;
      case 6:
         var1 = (int[])this.a;
         this.a.a[this.a].a(var1);
         return;
      case 7:
         this.a.a[this.a].c();
         return;
      case 8:
         eg.a.b = true;
         br.b = false;
         var3 = (bq)eg.a.a.a(this.a.a[0]);
         String var6;
         if (bg.a(this.a) > 0) {
            var6 = bg.a(this.a) + " (ngoc)";
            var3.a.a(var6, 3, System.currentTimeMillis());
         }

         if (bg.b(this.a) > 0) {
            var6 = bg.b(this.a) + " EXP";
            var3.a.a(var6, 3, System.currentTimeMillis() + 1000L);
         }

         if (bg.a(this.a) != null && bg.a(this.a).length > 0) {
            bb var7;
            (var7 = new bb("Nhận được " + bg.a(this.a)[0].a)).a();
            fs.e.addElement(var7);
         }

         if (this.a.c) {
            ds var8 = eg.a.a.a(bg.c(this.a));
            bb var4;
            (var4 = new bb(var8.d + " thắng!")).a();
            fs.e.addElement(var4);
         } else if (bg.c(this.a) != this.a.a[0] && eg.a.a.a != 12) {
            j.a("Thua rồi, bạn có muốn về thành phố để điều trị?", new gq(5, c.a(337), this.a), j.b);
         }

         this.a.a = false;
         return;
      case 9:
         int var2;
         for(var2 = 0; var2 < this.a.a.length; ++var2) {
            eg.a.b(this.a.a[var2]);
         }

         for(var2 = 0; var2 < this.a.a.length; ++var2) {
            if ((var3 = (bq)eg.a.a.a(this.a.a[var2])) != null && var3.a != null) {
               var3.a.f = true;
            }
         }

         if (!this.a.c && bg.c(this.a) != this.a.a[0]) {
            ((bx)eg.a).a((dz)this.a.a);
            ((bx)eg.a).c(this.a.a);
         }

         this.a.a = false;
         return;
      case 10:
         ((fh)this.a).a(true);
         this.a.a = false;
         return;
      case 11:
         var1 = (int[])this.a;
         this.a.a[this.a].b(var1);
      }

   }
}
