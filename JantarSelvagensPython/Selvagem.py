import threading
import time
import random

class Selvagem(threading.Thread):
    def __init__(self, caldeirao):
        threading.Thread.__init__(self)
        self.caldeirao = caldeirao

    def run(self):
        while True:
            self.caldeirao.servir()
            self.comer()

    def comer(self):
        print("Um selvagem está comendo.")
        time.sleep(random.uniform(0.5, 1.5))  # Tempo aleatório para comer
