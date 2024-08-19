function solution(dirs) {
  const visitedRoute = new Set();
  let x = 0, y = 0;

  for (let dir of dirs) {
      let new_x = x;
      let new_y = y;

      switch(dir) {
          case "U":
              new_y += 1;
              break;
          case "D":
              new_y -= 1;
              break;
          case "R":
              new_x += 1;
              break;
          case "L":
              new_x -= 1;
              break;
      }

      if (new_x >= -5 && new_x <= 5 && new_y >= -5 && new_y <= 5) {
          const route = `${x},${y}->${new_x},${new_y}`;
          const reverseRoute = `${new_x},${new_y}->${x},${y}`;

          visitedRoute.add(route);
          visitedRoute.add(reverseRoute);

          x = new_x;
          y = new_y;
      }
  }
  return visitedRoute.size / 2;
}