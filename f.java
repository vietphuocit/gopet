import java.util.Vector;

final class f extends fz {
   private int a;
   private final Vector a;
   private final e a;

   f(e var1, int var2, Vector var3) {
      super(2);
      this.a = var1;
      this.a = var3;
      this.a = this.a.size();
   }

   public final void a() {
      bc.a.translate(-this.z, -this.A);
      int var1;
      int var10000 = (var1 = this.A / this.a.b * this.b) < 0 ? 0 : var1;
      var1 = var10000;
      int var2;
      if ((var2 = var10000 + e.a(this.a)) > this.a) {
         var2 = this.a;
      }

      for(var1 = var1; var1 < var2; ++var1) {
         int var3 = var1 % this.b;
         int var4 = var1 / this.b;
         var3 = var3 * this.a.b + (var3 + 1) * this.c;
         var4 *= this.a.b;
         if (this.e && var1 == this.a.a) {
            gf.a(bc.a, this.k ? gg.j : gg.b, this.k ? gg.i : gg.a, var3 + 1, var4 + 1, this.a.b - 2, this.a.b - 2, false);
            bc.a.setColor(gg.d);
            bc.a.drawRoundRect(var3, var4, this.a.b - 1, this.a.b - 1, gg.q, gg.q);
         }

         eh var5 = (eh)this.a.elementAt(var1);
         bc.a.drawImage(v.h, var3 + (this.a.b >> 1), var4 + (this.a.b >> 1), 3);
         v.d().a(bc.a, "" + var5.a, var3 + (this.a.b >> 1) - 10, var4 + 15, 17);
         v.b.a(bc.a, var5.a(), var3 + (this.a.b >> 1) + 10, var4 + 11, 17);
      }

      bc.a.translate(this.z, this.A);
   }

   public final boolean a(int var1, int var2) {
      if (var1 != 0) {
         return false;
      } else {
         boolean var4 = false;
         e var10000;
         if (var2 == -2) {
            var10000 = this.a;
            var10000.a += this.b;
            if (this.a.a >= this.a.size()) {
               this.a.a = 0;
            }

            var4 = true;
         } else if (var2 == -1) {
            var10000 = this.a;
            var10000.a -= this.b;
            if (this.a.a < 0) {
               this.a.a = this.a.size() - 1;
            }

            var4 = true;
         } else if (var2 == -4) {
            ++this.a.a;
            if (this.a.a >= this.a.size()) {
               this.a.a = 0;
            }

            var4 = true;
         } else if (var2 == -3) {
            --this.a.a;
            if (this.a.a < 0) {
               this.a.a = this.a.size() - 1;
            }

            var4 = true;
         }

         var2 = this.a.a % this.b;
         int var3 = this.a.a / this.b;
         var2 = var2 * this.a.b + (var2 + 1) * this.c;
         var3 *= this.a.b;
         this.b(var2, var3, this.a.b, this.a.b);
         return var4;
      }
   }

   public final boolean b(int var1, int var2) {
      super.b(var1, var2);

      for(int var3 = 0; var3 < this.a; ++var3) {
         int var4 = var3 % this.b;
         int var5 = var3 / this.b;
         var4 = var4 * this.a.b + (var4 + 1) * this.c;
         var5 *= this.a.b;
         int var6 = var1 - this.r - this.y + this.z;
         int var7 = var2 - this.s - this.y + this.A;
         if (var6 > var4 && var6 < var4 + this.a.b && var7 > var5 && var7 < var5 + this.a.b) {
            this.a.a = var3;
            return true;
         }
      }

      return false;
   }
}
