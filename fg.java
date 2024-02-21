public final class fg extends fz {
   public int a = -1;
   public go a;

   public fg(int var1, int var2, int var3, int var4) {
      super(0, 0, var3, var4);
   }

   private void i() {
      if (this.a != -1) {
         if (this.a < this.b()) {
            ((ff)this.a(this.a)).a = false;
            ((ff)this.a(this.a)).k = false;
            ((ff)this.a(this.a)).e = false;
         }

         this.a = -1;
      }

   }

   public final void a(ff var1) {
      if (var1 == null) {
         this.i();
      } else {
         int var2 = this.a.length;

         while(true) {
            --var2;
            if (var2 < 0) {
               break;
            }

            if (var1 == this.a[var2]) {
               this.a(var2);
               break;
            }
         }

      }
   }

   public final void a(int var1) {
      if (this.a != var1) {
         this.i();
         ((ff)this.a(var1)).a = true;
         this.a = var1;
         this.c = (ff)this.a(var1);
         if (this.a != null) {
            this.a.a(this);
         }

      }
   }
}
