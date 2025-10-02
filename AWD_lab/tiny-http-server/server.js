const http = require('http');
const PORT = 3000;
const server = http.createServer((req, res) => {
  res.writeHead(200, { 'Content-Type': 'text/plain' });
  const message = 'Hello\nCurrent Date & Time: ${new Date().toString()}';
  res.end(message);
});
server.listen(PORT, () => {
  console.log('Server is running at http://localhost:${PORT}');
});