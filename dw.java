public final class dw extends dz {
   public int a;
   public int b;
   private int e;
   private long a;
   public int c;
   public int d;
   private boolean a = true;

   public dw() {
      this.a(new gn(-5, -4, 9, 8));
   }

   public final void a(int var1, int var2) {
      bc.a.drawRegion(v.l, 9 * this.e, 0, 9, 8, this.a ? 0 : 2, this.m - var1, this.n - var2 - 50, 0);
   }

   public final void a(long var1) {
      super.a(var1);
      if (var1 - this.a > 100L) {
         this.a = var1;
         this.e = (this.e + 1) % 2;
      }

      if (au.a(this.d - this.n) <= 2 && au.a(this.c - this.m) <= 2) {
         this.m = this.c;
         this.n = this.d;
         this.c += au.b(40) - 20;
         this.d += au.b(40) - 20;
         if (this.c < 0) {
            this.c = 0;
         }

         if (this.c > this.a) {
            this.c = this.a;
         }

         if (this.d - 40 < 0) {
            this.d = 40;
         }

         if (this.d > this.b) {
            this.d = this.b;
            return;
         }
      } else if (au.a(this.c - this.m) > au.a(this.d - this.n)) {
         if (this.c > this.m) {
            this.m += 2;
            this.a = true;
         } else {
            this.a = false;
            this.m -= 2;
         }

         if (this.c != this.m) {
            if (this.c > this.m) {
               this.n += 2 * (this.d - this.n) / (this.c - this.m);
               return;
            }

            this.n += 2 * (this.n - this.d) / (this.c - this.m);
            return;
         }
      } else {
         if (this.d > this.n) {
            this.n += 2;
         } else {
            this.n -= 2;
         }

         if (this.d != this.n) {
            if (this.d > this.n) {
               this.m += 2 * (this.c - this.m) / (this.d - this.n);
               return;
            }

            this.m += 2 * (this.m - this.c) / (this.d - this.n);
         }
      }

   }
}
