library(tidymodels)

str(iris)
ggplot(iris, aes(x = Sepal.Length, y = Sepal.Width)) +
  geom_point()

#
iris %>%
  filter(Sepal.Length > 5)
