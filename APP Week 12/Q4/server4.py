
#to run type python server.py
import socket

def start_server():
    server_host = '192.168.56.1'
    server_port = 12345

    server_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    server_socket.bind((server_host, server_port))

    print(f"UDP server is listening on {server_host}:{server_port}")

    while True:
        data, client_address = server_socket.recvfrom(1024)
        number = int(data.decode('utf-8'))

        result = "Even" if number % 2 == 0 else "Odd"
        server_socket.sendto(result.encode('utf-8'), client_address)

if __name__ == "__main__":
    start_server()
