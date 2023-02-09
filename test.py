import configparser,sys

secret = str(sys.argv[1])
parser = configparser.ConfigParser()
parser.read(secret)

for sect in parser.sections():
   print('Section:', sect)
   for k,v in parser.items(sect):
      print(' {} = {}'.format(k,v))
   print()
