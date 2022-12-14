write('PATH="${RTOOLS40_HOME}\\usr\\bin;${PATH}"', file = "~/.Renviron", append = TRUE)
Sys.which("make")

install.packages("jsonlite", type = "source")

install.packages("tidymodels")

library(tidymodels)

str(iris)
ggplot(iris, aes(x = Sepal.Length, y = Sepal.Width)) +
  geom_point()
