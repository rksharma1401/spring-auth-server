CREATE TABLE user(
  id INTEGER  PRIMARY KEY,
  user_name  VARCHAR(500), 
  password VARCHAR(500),   
  roles  VARCHAR(500), 
  active  boolean ,
  CONSTRAINT user_username_unique UNIQUE (user_name)
); 
