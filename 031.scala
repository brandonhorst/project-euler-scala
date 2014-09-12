
//how can we do this as naively as possible?

var ways = 0

for (a <- 0 to 200 by 200;
  b <- 0 to 200 by 100;
  c <- 0 to 200 by 50;
  d <- 0 to 200 by 20;
  e <- 0 to 200 by 10;
  f <- 0 to 200 by 5;
  g <- 0 to 200 by 2;
  h <- 0 to 200) {
  if (a + b + c + d + e + f + g + h == 200) ways += 1
}

//bingo

println(ways)