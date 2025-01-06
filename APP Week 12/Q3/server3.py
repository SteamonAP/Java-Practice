import socket

#to run type python server3.py

def start_server():
    server_host = '192.168.56.1'
    server_port = 12345

    server_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    server_socket.bind((server_host, server_port))

    print(f"UDP server is listening on {server_host}:{server_port}")

    while True:
        data, client_address = server_socket.recvfrom(1024)
        print(f"Received data from {client_address}: {data.decode('utf-8')}")

        response = "Server received your message"
        server_socket.sendto(response.encode('utf-8'), client_address)

if __name__ == "__main__":
    start_server()
