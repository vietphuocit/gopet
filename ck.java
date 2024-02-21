public final class ck extends ci {
   public String a;
   public String[] a;
   public byte c;

   public ck(cg var1) {
      super(var1);
   }

   public final void a() {
      int var1 = 0;
      if (this.b == 17) {
         var1 = this.t >> 1;
      } else if (this.b == 24) {
         var1 = this.t;
      }

      fl var2 = v.a(this.c);
      int var3 = 2;

      for(int var4 = 0; var4 < this.a.length; ++var4) {
         var2.a(bc.a, this.a[var4], var1, var3, this.b);
         var3 += var2.a();
      }

   }
}
