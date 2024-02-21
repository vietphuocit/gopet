public final class fx extends fy {
   private String[] a = new String[0];
   private fl a;
   private int c;
   public int a = 20;
   public int b = 3;

   public fx() {
      this.y = gg.p;
      this.j = true;
   }

   public final void a(String var1, fl var2) {
      if (var1 == null) {
         var1 = "";
      }

      this.a = var2;
      this.a = var2.a(var1, this.t - (this.y << 1));
      this.a.b = this.a.length * (var2.a() + this.b) - this.b;
      this.a.a = this.t - (this.y << 1);
      this.c = this.a.b - this.u;
   }

   public final void a() {
      if (this.a != null) {
         int var1 = 0;

         for(int var2 = 0; var2 < this.a.length; ++var2) {
            int var3 = this.a == 17 ? this.t >> 1 : (this.a == 24 ? this.t - this.y : 0);
            if (var1 - this.A + this.a.a() >= 0) {
               this.a.a(bc.a, this.a[var2], var3 - this.z, var1 - this.A, this.a);
            }

            if ((var1 += this.a.a() + this.b) - this.A > this.u) {
               break;
            }
         }
      }

   }

   public final boolean a(int var1, int var2) {
      if (var2 == -2 && this.a.b > this.u - 2 * this.y && this.B < this.c) {
         this.b(this.r + this.y, this.B + this.u - 2 * this.y, this.t - 2 * this.y, this.a.a());
      } else {
         if (var2 != -1 || this.a.b <= this.u - 2 * this.y || this.B <= 0) {
            return false;
         }

         this.b(this.r + this.y, this.B - this.a.a(), this.t - 2 * this.y, this.a.a());
      }

      return true;
   }
}
