import socket
import pickle
#change directory in terminal by cd "D:\Java Programs\APP Week 12\Q2"
#to run type python server.py

def start_server():
    server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    server_host = '192.168.56.1'
    server_port = 12345

    server_socket.bind((server_host, server_port))
    server_socket.listen(5)

    print("Server is listening on {server_host}:{server_port}")

    while True:
        client_socket, client_address = server_socket.accept()
        print("Connection from {client_address}")

        data = client_socket.recv(1024)
        numbers = pickle.loads(data)

        result = sum(numbers)

        client_socket.send(str(result).encode('utf-8'))
        client_socket.close()

if __name__ == "__main__":
    start_server()
