  ## Configuration 1:
  
  try {
      val cons = Class.forName(appClassName+"$").getDeclaredConstructors();
      cons(0).setAccessible(true);
      jobObject = cons(0).newInstance().asInstanceOf[JobObject]
      jobObject.initialize(args)
      jobObject.execute()
    } catch { case e:Exception => e.printStackTrace }
