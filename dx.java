public final class dx extends dz {
   private byte b;
   public int a;
   public byte a;
   gb[] a;

   public dx(int var1, byte var2) {
      this.b = var2;
      this.a = var1;
   }

   public final void c(int var1, int var2) {
      switch(this.b) {
      case 0:
         if (this.b != null) {
            bc.a.drawImage(this.b, var1 - (this.b.getWidth() >> 1), var2 - this.b.getHeight(), 0);
            return;
         }
         break;
      case 1:
         if (this.a != null) {
            this.a[this.a].b(bc.a, var1, var2, 0);
         }
      }

   }

   public final void a(int var1, int var2) {
      this.c(this.m - var1, this.n - var2);
   }

   public final gn a() {
      this.a.a = this.o + this.m;
      this.a.b = this.p + this.n;
      return this.a;
   }
}
