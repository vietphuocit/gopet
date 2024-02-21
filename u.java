final class u implements go {
   private final fi a;
   private final fi b;
   private final int a;

   u(fi var1, fi var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.a = var3;
   }

   public final void a(Object var1) {
      if (!this.a.a().trim().equals("")) {
         try {
            long var2;
            if ((var2 = Long.parseLong(this.a.a().trim())) <= br.a) {
               this.b.b(au.a(var2 * (long)this.a));
               return;
            }

            var2 = br.a;
            this.a.b("" + var2);
         } catch (Exception var4) {
            return;
         }
      } else {
         this.b.b("0");
      }

   }
}
